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
package org.sonar.plugins.objectivec;

import java.util.List;

import org.sonar.api.profiles.RulesProfile;
import org.sonar.api.rules.AnnotationRuleParser;
import org.sonar.api.rules.Rule;
import org.sonar.api.rules.RuleRepository;
import org.sonar.objectivec.checks.CheckList;
import org.sonar.plugins.objectivec.core.ObjectiveC;

public class ObjectivecRuleRepository extends RuleRepository{

	private static final String REPOSITORY_NAME = "Sonar way";
	private final AnnotationRuleParser annotationRuleParser;
	
	public ObjectivecRuleRepository(AnnotationRuleParser annotationRuleParser) {
		 super(CheckList.REPOSITORY_KEY, ObjectiveC.KEY);
		    setName(REPOSITORY_NAME);
		    this.annotationRuleParser = annotationRuleParser;
	}

	@Override
	public List<Rule> createRules() {
		System.out.println("_____________  RULES PROFILE AFTER SAVING _____________" + annotationRuleParser.parse(CheckList.REPOSITORY_KEY, CheckList.getChecks()).toString());
		return annotationRuleParser.parse(CheckList.REPOSITORY_KEY, CheckList.getChecks());
	}

}
