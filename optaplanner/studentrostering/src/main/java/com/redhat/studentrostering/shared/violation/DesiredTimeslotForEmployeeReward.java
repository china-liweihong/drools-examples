/*
 * Copyright 2018 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.redhat.studentrostering.shared.violation;

import org.optaplanner.core.api.score.buildin.hardmediumsoftlong.HardMediumSoftLongScore;

import com.redhat.studentrostering.shared.employee.EmployeeAvailability;
import com.redhat.studentrostering.shared.shift.Shift;

public class DesiredTimeslotForEmployeeReward implements ConstraintMatchView {

    private EmployeeAvailability employeeAvailability;
    private Shift shift;

    private HardMediumSoftLongScore score;

    public DesiredTimeslotForEmployeeReward() {

    }

    public DesiredTimeslotForEmployeeReward(Shift shift, EmployeeAvailability employeeAvaliability, HardMediumSoftLongScore score) {
        this.shift = shift;
        this.employeeAvailability = employeeAvaliability;
        this.score = score;
    }

    public EmployeeAvailability getEmployeeAvailability() {
        return employeeAvailability;
    }

    public void setEmployeeAvailability(EmployeeAvailability employeeAvailability) {
        this.employeeAvailability = employeeAvailability;
    }

    public Shift getShift() {
        return shift;
    }

    public void setShift(Shift shift) {
        this.shift = shift;
    }

    public HardMediumSoftLongScore getScore() {
        return score;
    }

    public void setScore(HardMediumSoftLongScore score) {
        this.score = score;
    }
}
