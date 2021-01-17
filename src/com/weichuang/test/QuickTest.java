package com.weichuang.test;

import com.weichuang.mapper.UmsUserMapper;
import com.weichuang.pojo.UmsUser;
import com.weichuang.pojo.UmsUserExample;
import com.weichuang.util.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class QuickTest {


    @Test
    public void testFn(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UmsUserMapper mapper = sqlSession.getMapper(UmsUserMapper.class);
        //mapper逆向工程针对于一张表的CURD都可以处理。
        UmsUser umsUser = mapper.selectByPrimaryKey(5);
        umsUser.setName("张三");
        mapper.updateByPrimaryKey(umsUser);

        UmsUserExample umsUserExample = new UmsUserExample();
        //并且关系应用
        /*umsUserExample.createCriteria().andNameEqualTo("张三").andSexEqualTo(1);
        List<UmsUser> umsUserList = mapper.selectByExample(umsUserExample);
        System.out.println(umsUserList);*/
        umsUserExample.createCriteria().andNameEqualTo("张三");
        umsUserExample.or(umsUserExample.createCriteria().andSexEqualTo(1));
        //umsUserExample.or().andAgeEqualTo(22);直接使用

        List<UmsUser> umsUserList = mapper.selectByExample(umsUserExample);
        System.out.println(umsUserList);

        //可以设定排序规则
        umsUserExample.setOrderByClause("money desc");

        List<UmsUser> umsUserListOrderBy =  mapper.selectByExample(umsUserExample);
        System.out.println(umsUserListOrderBy);

        List<Integer> ids = new ArrayList<>();
        ids.add(1);
        ids.add(4);
        UmsUserExample umsUserExample1 = new UmsUserExample();
        umsUserExample1.createCriteria().andIdIn(ids);

        List<UmsUser> umsUserListInIds =  mapper.selectByExample(umsUserExample1);
        System.out.println(umsUserListInIds);

    }
}
