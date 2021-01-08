package com.sparta.spartaSimulator.model;

import com.sparta.spartaSimulator.controller.Centres;

public class TechCentre extends TraineeCentre implements Centres {

    private final TrainingCourse.CourseType centreCourseType;

    public TechCentre() {
        setMaxCapacity(200);
        setCentreStatus(CentreStatus.NOT_FULL);
        this.centreCourseType = TrainingCourse.setRandomCourseType();
        setSafePeriod(6);
    }

    //Testing purposes only in TechCentreTests
    public TechCentre(TrainingCourse.CourseType thisOne) {
        setMaxCapacity(200);
        setCentreStatus(CentreStatus.NOT_FULL);
        this.centreCourseType = thisOne;
        setSafePeriod(6);
    }

    @Override
    public TrainingCourse.CourseType getCentreCourseType() {
        return centreCourseType;
    }

    @Override
    public void addTrainee(Trainee trainee) {
        if (getCentreCourseType() == trainee.getTraineeCourse()) {
            super.addTrainee(trainee);
        }
    }

}
