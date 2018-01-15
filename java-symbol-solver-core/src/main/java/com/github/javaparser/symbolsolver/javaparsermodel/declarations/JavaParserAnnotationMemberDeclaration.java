/**
 * Copyright 2017 - The JavaParser Team
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.javaparser.symbolsolver.javaparsermodel.declarations;

import com.github.javaparser.ast.body.AnnotationMemberDeclaration;
import com.github.javaparser.ast.expr.Expression;
import com.github.javaparser.resolution.declarations.ResolvedAnnotationMemberDeclaration;
import com.github.javaparser.resolution.types.ResolvedType;
import com.github.javaparser.symbolsolver.model.resolution.TypeSolver;

/**
 * @author Federico Tomassetti
 */
public class JavaParserAnnotationMemberDeclaration implements ResolvedAnnotationMemberDeclaration {

    private com.github.javaparser.ast.body.AnnotationMemberDeclaration wrappedNode;
    private TypeSolver typeSolver;

    public AnnotationMemberDeclaration getWrappedNode() {
        return wrappedNode;
    }

    public JavaParserAnnotationMemberDeclaration(AnnotationMemberDeclaration wrappedNode, TypeSolver typeSolver) {
        this.wrappedNode = wrappedNode;
        this.typeSolver = typeSolver;
    }

    @Override
    public Expression getDefaultValue() {
        throw new UnsupportedOperationException();
    }

    @Override
    public ResolvedType getType() {
        throw new UnsupportedOperationException();
    }

    @Override
    public String getName() {
        return wrappedNode.getNameAsString();
    }
}
