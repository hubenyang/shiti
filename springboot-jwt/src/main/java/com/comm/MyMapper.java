package com.comm;


import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

import java.io.Serializable;

/**
 * @author huebnyang
 * @date 2019/3/5 20:00
 */
public interface MyMapper<T> extends Mapper<T>, MySqlMapper<T>,Serializable {
    //该接口不能被扫描到，否则会出错
//   public PageModel<T> getPage(Pageable pageable);
}