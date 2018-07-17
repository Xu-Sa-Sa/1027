package cn.edu.zut.demo.dao;

import cn.edu.zut.demo.entity.area;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @Author: 徐静巧
 * @Date: 创建时间：2018/7/15 19:44
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class AreaDaoTest {
    @Autowired
    private AreaDao areaDao;

    @Test
    public void query() {
        List<area> areaList=areaDao.query();
        assertEquals(2,areaList.size());//判断两个相等
    }

    @Test
    public void querryAreaById() {
        area area=areaDao.querryAreaById(1);
        assertEquals("东苑",area.getAreaName());
    }

    @Test
    public void insertArea() {
        area a=new area();
        a.setAreaName("南苑");
        a.setPriority(1);
        int e=areaDao.insertArea(a);
        assertEquals(1,e);
    }

    @Test
    public void updateArea() {
        area a=new area();
        a.setAreaName("西苑");
        a.setLastEditTime(new Date());
        a.setAreaId(3);
        int e=areaDao.updateArea(a);
        assertEquals(1,e);
    }

    @Test
    public void deleteArea() {
        int e=areaDao.deleteArea(3);
        assertEquals(1,e);
    }
}