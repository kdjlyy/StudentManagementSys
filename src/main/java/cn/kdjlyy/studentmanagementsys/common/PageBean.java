package cn.kdjlyy.studentmanagementsys.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PageBean<E> {
    // not necessary
    private int currentPage;
    private int pageSize;
    private int totalPage;

    private int totalCount;
    private List<E> data;
}

