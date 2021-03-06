// Generated by shift-java-gen/ast.js

/*
 * Copyright 2016 Shape Security, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.shapesecurity.shift.es2016.ast;

import javax.annotation.Nonnull;
import com.shapesecurity.functional.data.HashCodeBuilder;
import com.shapesecurity.functional.data.Maybe;

public class TryFinallyStatement implements Statement {
    @Nonnull
    public final Block body;

    @Nonnull
    public final Maybe<CatchClause> catchClause;

    @Nonnull
    public final Block finalizer;


    public TryFinallyStatement (@Nonnull Block body, @Nonnull Maybe<CatchClause> catchClause, @Nonnull Block finalizer) {
        this.body = body;
        this.catchClause = catchClause;
        this.finalizer = finalizer;
    }


    @Override
    public boolean equals(Object object) {
        return object instanceof TryFinallyStatement && this.body.equals(((TryFinallyStatement) object).body) && this.catchClause.equals(((TryFinallyStatement) object).catchClause) && this.finalizer.equals(((TryFinallyStatement) object).finalizer);
    }


    @Override
    public int hashCode() {
        int code = HashCodeBuilder.put(0, "TryFinallyStatement");
        code = HashCodeBuilder.put(code, this.body);
        code = HashCodeBuilder.put(code, this.catchClause);
        code = HashCodeBuilder.put(code, this.finalizer);
        return code;
    }

}
