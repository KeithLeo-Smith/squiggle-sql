/*
 * Copyright 2004-2015 Joe Walnes, Guillaume Chauvet.
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
package io.zatarox.squiggle.criteria;

import io.zatarox.squiggle.Criteria;

/**
 * Used for adding CRITERIA1 OR CRITERIA2 to a statement.
 * <pre>
 * SelectQuery select = ... ... Criteria a = new MatchCriteria(table, col1, "=",
 * 1); Criteria b = new MatchCriteria(table, col2, "=", 2);
 * select.addCriteria(new OR(a, b)); // ( table.col1 = 1 OR table.col2 = 2 )
 * </pre>
 */
public class OR extends BaseLogicGroup {

    public OR(Criteria left, Criteria right) {
        super("OR", left, right);
    }

}
