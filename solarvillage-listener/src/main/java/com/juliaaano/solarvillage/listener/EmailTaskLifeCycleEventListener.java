package com.juliaaano.solarvillage.listener;

import static java.lang.String.format;

import org.kie.api.task.TaskEvent;
import org.kie.api.task.TaskLifeCycleEventListener;

public class EmailTaskLifeCycleEventListener implements TaskLifeCycleEventListener {

    @Override
    public void afterTaskReassignedEvent(TaskEvent event) {

        final String taskName = event.getTask().getName();

        if ("HOA Approval".equals(taskName)) {
            System.out.println(format("Task %s has been reassigned. An email notification will be sent.", taskName));
        }
    }

    @Override
    public void beforeTaskActivatedEvent(TaskEvent event) {
    }

    @Override
    public void beforeTaskClaimedEvent(TaskEvent event) {
    }

    @Override
    public void beforeTaskSkippedEvent(TaskEvent event) {
    }

    @Override
    public void beforeTaskStartedEvent(TaskEvent event) {
    }

    @Override
    public void beforeTaskStoppedEvent(TaskEvent event) {
    }

    @Override
    public void beforeTaskCompletedEvent(TaskEvent event) {
    }

    @Override
    public void beforeTaskFailedEvent(TaskEvent event) {
    }

    @Override
    public void beforeTaskAddedEvent(TaskEvent event) {
    }

    @Override
    public void beforeTaskExitedEvent(TaskEvent event) {
    }

    @Override
    public void beforeTaskReleasedEvent(TaskEvent event) {
    }

    @Override
    public void beforeTaskResumedEvent(TaskEvent event) {
    }

    @Override
    public void beforeTaskSuspendedEvent(TaskEvent event) {
    }

    @Override
    public void beforeTaskForwardedEvent(TaskEvent event) {
    }

    @Override
    public void beforeTaskDelegatedEvent(TaskEvent event) {
    }

    @Override
    public void beforeTaskNominatedEvent(TaskEvent event) {
    }

    @Override
    public void afterTaskActivatedEvent(TaskEvent event) {
    }

    @Override
    public void afterTaskClaimedEvent(TaskEvent event) {
    }

    @Override
    public void afterTaskSkippedEvent(TaskEvent event) {
    }

    @Override
    public void afterTaskStartedEvent(TaskEvent event) {
    }

    @Override
    public void afterTaskStoppedEvent(TaskEvent event) {
    }

    @Override
    public void afterTaskCompletedEvent(TaskEvent event) {
    }

    @Override
    public void afterTaskFailedEvent(TaskEvent event) {
    }

    @Override
    public void afterTaskAddedEvent(TaskEvent event) {
    }

    @Override
    public void afterTaskExitedEvent(TaskEvent event) {
    }

    @Override
    public void afterTaskReleasedEvent(TaskEvent event) {
    }

    @Override
    public void afterTaskResumedEvent(TaskEvent event) {
    }

    @Override
    public void afterTaskSuspendedEvent(TaskEvent event) {
    }

    @Override
    public void afterTaskForwardedEvent(TaskEvent event) {
    }

    @Override
    public void afterTaskDelegatedEvent(TaskEvent event) {
    }

    @Override
    public void afterTaskNominatedEvent(TaskEvent event) {
    }

}
