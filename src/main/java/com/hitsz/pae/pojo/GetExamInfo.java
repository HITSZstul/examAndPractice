package com.hitsz.pae.pojo;/*
 *@Author:Simon
 *@Date: 2024-11-20 - 2024 11 20 11:53
 *@Description:praticeAndExam
 *@version:1.0
 */

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*这里是保存了前端送来的id和profession*/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetExamInfo {
    private Integer id;
    private Integer profession;
}
