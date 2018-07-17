package cn.edu.zut.demo.dao;

import cn.edu.zut.demo.entity.area;

import java.util.List;

/**
 * @Author: 徐静巧
 * @Date: 创建时间：2018/7/15 19:17
 */
public interface AreaDao {
    //列出区域列表 return arealist
    List<area> query();
    //根据ID列出具体区域 return area
    area querryAreaById(int areaId);
    //插入区域信息 @param area
    int insertArea(area area);
    //更新区域信息
    int updateArea (area area);
    //删除区域
    int deleteArea(int areaId);
}
