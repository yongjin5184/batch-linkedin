package com.example.tutorial.batchlinkedin;

import org.springframework.batch.core.job.flow.JobExecutionDecider;

import java.time.LocalDateTime;

import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.StepExecution;
import org.springframework.batch.core.job.flow.FlowExecutionStatus;

public class DeliveryDecider implements JobExecutionDecider {

    @Override
    public FlowExecutionStatus decide(JobExecution jobExecution, StepExecution stepExecution) {

        String result = LocalDateTime.now().getHour() > 12 ? "PRESENT" : "NOT_PRESENT";
        System.out.println("Decider result is:  " + result);
        return new FlowExecutionStatus(result);
    }
}

