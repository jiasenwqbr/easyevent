package com.easyevent.fecher;

import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsMutation;
import com.netflix.graphql.dgs.DgsQuery;
import com.netflix.graphql.dgs.InputArgument;

import java.util.Arrays;
import java.util.List;

/**
 * @Description:
 * @author: 贾森
 * @date: 2024年07月08日 下午3:45
 */
@DgsComponent
public class EventDataFetcher {
    @DgsQuery
    public List<String> events(){
        return Arrays.asList("zhansan","lisi","wangwu");
    }
    @DgsMutation
    public String createEvent(@InputArgument String name){
        return name+" created";
    }
}
