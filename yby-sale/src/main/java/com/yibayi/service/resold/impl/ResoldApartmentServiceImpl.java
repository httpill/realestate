package com.yibayi.service.resold.impl;

import com.yibayi.bean.entity.resold.ResoldApartment;
import com.yibayi.bean.entity.resold.dto.ReleaseRADto;
import com.yibayi.dao.resold.ResoldApartmentMapper;
import com.yibayi.service.resold.ResoldApartmentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 二手房 服务实现类
 * </p>
 *
 * @author mamba
 * @since 2019-08-25
 */
@Service
public class ResoldApartmentServiceImpl extends ServiceImpl<ResoldApartmentMapper, ResoldApartment> implements ResoldApartmentService {

    public void releaseRA(ReleaseRADto releaseRADto){
        

    }

}
