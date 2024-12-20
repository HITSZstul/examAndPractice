package com.hitsz.pae.controller;/*
 *@Author:Simon
 *@Date: 2024-11-17 - 2024 11 17 21:21
 *@Description:praticeAndExam
 *@version:1.0
 */

import com.hitsz.pae.pojo.*;
import com.hitsz.pae.sevice.ExerciseService;
import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
public class PracticeController {

    @Autowired
    ExerciseService exerciseService;
    /*
    * 查询学员的题单完成情况：展示在练习界面中*/
    @GetMapping("/exercise/{id}")
    public Result getExerciseSurface(@PathVariable Integer id) {
        log.info("getExerciseSurface from "+id);
        PracticeList practiceList = new PracticeList(exerciseService.getPracticeSurface(id));
        return Result.success(practiceList);
    }

    /*在练习页面发送题目*/
    @PostMapping("/question/send")
    public Result getQuestionInList(@RequestBody GetListInfo getListInfo) {
        log.info("getQuestionInList from "+getListInfo);
        Question question = exerciseService.getQuestionByListIndex(getListInfo);
        return Result.success(question);
    }

    /*在练习接口收到学生作答，插入作答记录*/
    @PostMapping("/question/confirm")
    public Result confirmQuestion(@RequestBody Info_practice info_practice) {
        log.info("confirmQuestion from "+info_practice);
        exerciseService.savePracticeRecord(info_practice);
        return Result.success();
    }
}
