package com.easyevent.fecher;

import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsQuery;
import com.netflix.graphql.dgs.InputArgument;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @Description:
 * @author: 贾森
 * @date: 2024年07月02日 上午10:02
 */
@DgsComponent
public class ShowsDataFetcher {

    private final List<Show> shows = List.of(
            new Show("Stranger Things", 2016),
            new Show("Ozark", 2017),
            new Show("The Crown", 2016),
            new Show("Dead to Me", 2019),
            new Show("Orange is the New Black", 2013)
    );

    @DgsQuery
    public List<Show> shows(@InputArgument String titleFilter) {
        if(titleFilter == null) {
            return shows;
        }

        return shows.stream().filter(s -> s.title().contains(titleFilter)).collect(Collectors.toList());
    }
}

record Show(String title, int releaseYear) {}
