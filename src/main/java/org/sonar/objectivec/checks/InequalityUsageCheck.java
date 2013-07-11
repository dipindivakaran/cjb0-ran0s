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

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.sonar.check.BelongsToProfile;
import org.sonar.check.Priority;
import org.sonar.check.Rule;
import org.sonar.objectivec.api.ObjectiveCGrammar;
import org.sonar.objectivec.api.ObjectiveCPunctuator;

import com.sonar.sslr.api.AstNode;
import com.sonar.sslr.squid.checks.SquidCheck;

@Rule(
	key = "InequalityUsage",
	name = "Invalid usage of <>",
	description = "Test description",
	priority = Priority.MAJOR)
@BelongsToProfile(title=CheckList.SONAR_WAY_PROFILE,priority = Priority.MAJOR)
public class InequalityUsageCheck extends SquidCheck<ObjectiveCGrammar> {
	
	@Override
	public void init() {
     System.out.println("#################   IN INIT METHOD ##################");
		 subscribeTo(ObjectiveCPunctuator.NOT_EQU2);
	}
	
	@Override
	public void visitNode(AstNode astNode) {
		System.out.println("##################   VIOLATION DETECTED ###################");
		getContext().createLineViolation(this,"Replace \"<>\" by \"!=\".", astNode);
	}

}
