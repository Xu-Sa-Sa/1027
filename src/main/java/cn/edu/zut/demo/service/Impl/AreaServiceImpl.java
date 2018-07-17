package cn.edu.zut.demo.service.Impl;

import cn.edu.zut.demo.dao.AreaDao;
import cn.edu.zut.demo.entity.area;
import cn.edu.zut.demo.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

/**
 * @Author: 徐静巧
 * @Date: 创建时间：2018/7/16 14:58
 */
@Service
public class AreaServiceImpl implements AreaService {
    @Autowired
    private AreaDao areaDao;
    @Override
    public List<area> getAreaList() {
        return areaDao.query();
    }
    @Override
    public area getAreaById(int areaId) {
        int a=1/0;
        return areaDao.querryAreaById(areaId);
    }

    @Transactional
    @Override
    public boolean addArea(area area) {
        if(area.getAreaName()!=null&&!"".equals(area.getAreaName())){
            area.setCreateTime(new Date());
            area.setLastEditTime(new Date());
            try {
                int ef=areaDao.insertArea(area);
                if (ef>0){
                    return  true;
                }else{
                    throw  new RuntimeException("插入失败");
                }
            }catch (Exception e){
                throw new RuntimeException("插入异常："+e.getMessage());
            }
        }else {
            throw new RuntimeException("区域信息不能为空");
        }
    }
    @Transactional
    @Override
    public boolean modifyArea(area area) {
        if(area.getAreaId()!=null&&area.getAreaId()>0){
            area.setLastEditTime(new Date());
            try {
                int eff=areaDao.updateArea(area);
                if (eff>0){
                    return  true;
                }else{
                    throw  new RuntimeException("更新失败");
                }
            }catch (Exception e){
                throw new RuntimeException("更新异常："+e.toString());
            }
        }else {
            throw new RuntimeException("区域信息不能为空");
        }
    }

    @Transactional
    @Override
    public boolean deleteArea(int areaId) {
        if(areaId>0){
            try {
                int eff=areaDao.deleteArea(areaId);
                if (eff>0){
                    return  true;
                }else{
                    throw  new RuntimeException("删除失败");
                }
            }catch (Exception e){
                throw new RuntimeException("删除异常："+e.toString());
            }
        }else {
            throw new RuntimeException("区域Id不能为空");
        }
    }
}
