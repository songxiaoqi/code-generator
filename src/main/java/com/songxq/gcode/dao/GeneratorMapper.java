package com.songxq.gcode.dao;

import java.util.List;
import java.util.Map;

/**
 * 代码生成Dao
 *
 * @author songxq
 * @email wosongxiaoqi@163.com
 * @date 2019年06月24日 下午15:23:58
 */
public interface GeneratorMapper {
    List<Map<String, Object>> queryList(Map<String, Object> map);

    int queryTotal(Map<String, Object> map);

    Map<String, String> queryTable(String tableName);

    List<Map<String, String>> queryColumns(String tableName);
}
