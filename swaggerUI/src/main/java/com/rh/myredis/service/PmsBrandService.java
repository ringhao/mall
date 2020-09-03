package com.rh.myredis.service;

import com.rh.myredis.mbg.model.PmsBrand;

import java.util.List;

/**
 * 服务层接口类
 */
public interface PmsBrandService {

    List<PmsBrand> listAllBrand();

    int createBrand(PmsBrand brand);

    int updateBrand(Long id, PmsBrand brand);

    int deleteBrand(Long id);

    List<PmsBrand> listBrand(int pageNum, int pageSize);

    PmsBrand getBrand(Long id);

}
