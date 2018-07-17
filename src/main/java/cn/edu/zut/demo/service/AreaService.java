package cn.edu.zut.demo.service;

import cn.edu.zut.demo.entity.area;

import java.util.List;

/**
 * @Author: 徐静巧
 * @Date: 创建时间：2018/7/16 14:55
 */
public interface AreaService {
    //列出区域列表 return arealist
    List<area> getAreaList();
    //根据ID列出具体区域 return area
    area getAreaById(int areaId);
    //插入区域信息 @param area
    boolean addArea(area area);
    //更新区域信息
    boolean modifyArea (area area);
    //删除区域
    boolean deleteArea(int areaId);
}
