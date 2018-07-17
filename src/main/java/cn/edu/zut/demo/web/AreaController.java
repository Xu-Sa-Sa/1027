package cn.edu.zut.demo.web;

import cn.edu.zut.demo.entity.area;
import cn.edu.zut.demo.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: 徐静巧
 * @Date: 创建时间：2018/7/16 15:47
 */
@RestController
@RequestMapping("/supperadmin")
public class AreaController {
    @Autowired
    private AreaService areaService;

    @RequestMapping(value = "/listarea",method = RequestMethod.GET)
    private Map<String,Object> Listarea(){
        Map<String,Object> modelMAp=new HashMap<String,Object>();
        List<area> list=areaService.getAreaList();
        modelMAp.put("areaList",list);
        return modelMAp;
    }

    @RequestMapping(value = "/getareabyid",method = RequestMethod.GET)
    private Map<String,Object> getAreaById(Integer areaId){
        Map<String,Object> modelMap=new HashMap<String, Object>();
        area area=areaService.getAreaById(areaId);
        modelMap.put("area",area);
        return modelMap;
    }
    @RequestMapping(value = "/addarea",method = RequestMethod.POST)
    private  Map<String,Object> addArea(@RequestBody area area){
        Map<String,Object> modelMap=new HashMap<String, Object>();
        modelMap.put("success",areaService.addArea(area));
        return modelMap;
    }

    @RequestMapping(value = "/modify",method = RequestMethod.POST)
    private  Map<String,Object> modifyArea(@RequestBody area area){
        Map<String,Object> modelMap=new HashMap<String, Object>();
        modelMap.put("success",areaService.modifyArea(area));
        return modelMap;
    }

    @RequestMapping(value = "/remove",method = RequestMethod.GET)
    private Map<String,Object> removeArea(Integer areaId){
        Map<String,Object> modelMap=new HashMap<String, Object>();
        modelMap.put("success",areaService.deleteArea(areaId));
        return modelMap;
    }
}
