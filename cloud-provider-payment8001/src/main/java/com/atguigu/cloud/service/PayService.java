package com.atguigu.cloud.service;

import com.atguigu.cloud.entities.Pay;

import java.util.List;

/**
 * ClassName: PayService
 * Package: com.atguigu.cloud.service
 * Description:
 *
 * @Author: 王德举
 * @Create: 2024/3/9 - 11:08
 * @Version: v1.0
 */
public interface PayService {

    public int add(Pay pay);
    public int delete(Integer id);
    public int update(Pay pay);
    public Pay getById(Integer id);
    public List<Pay> getAll();
}
