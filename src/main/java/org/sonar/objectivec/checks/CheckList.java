/*
 * Sonar Objective-C Plugin
 * Copyright (C) 2012 François Helg, Cyril Picat and OCTO Technology
 * dev@sonar.codehaus.org
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02
 */
package org.sonar.objectivec.checks;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.collect.ImmutableList;

public final class CheckList {

    public static final String REPOSITORY_KEY = "objc";

    public static final String SONAR_WAY_PROFILE = "Sonar way";

    private CheckList() {
    }

    public static List<Class> getChecks() {
    	Calendar cal = Calendar.getInstance();
    	System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$   IN GET CHECKS METHOD 1$$$$$$$$$$$$$$$$$$" +  cal.getTime().toString() + ImmutableList.<Class> of(
        		InequalityUsageCheck.class
                ));
        return ImmutableList.<Class> of(
        		InequalityUsageCheck.class
                );
    }

}
