package com.atguigu.gmall.pms.service.impl;

import com.atguigu.gmall.pms.entity.AlbumPic;
import com.atguigu.gmall.pms.mapper.AlbumPicMapper;
import com.atguigu.gmall.pms.service.AlbumPicService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 画册图片表 服务实现类
 * </p>
 *
 * @author afei
 * @since 2020-05-08
 */
@Service
@Component
public class AlbumPicServiceImpl extends ServiceImpl<AlbumPicMapper, AlbumPic> implements AlbumPicService {

}
