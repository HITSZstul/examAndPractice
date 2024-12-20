package com.hitsz.pae.pojo;/*
 *@Author:Simon
 *@Date: 2024-11-19 - 2024 11 19 21:02
 *@Description:praticeAndExam
 *@version:1.0
 */

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
/*根据题单信息和题单号，查询题目的类*/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetListInfo {
    private Integer questionList_index;
    private Integer questionindex;
    private Integer profession;
}
