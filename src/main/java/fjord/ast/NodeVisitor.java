package fjord.ast;

import fjord.ast.expr.ApplicationExpression;
import fjord.ast.expr.ArrayExpression;
import fjord.ast.expr.AssertExpression;
import fjord.ast.expr.AssignmentExpression;
import fjord.ast.expr.BaseCall;
import fjord.ast.expr.ConstantExpression;
import fjord.ast.expr.DeterministicDisposalExpression;
import fjord.ast.expr.DotLookupExpression;
import fjord.ast.expr.DowncastExpression;
import fjord.ast.expr.ElifBranch;
import fjord.ast.expr.FieldInitializer;
import fjord.ast.expr.FunctionDefinitionExpression;
import fjord.ast.expr.IfExpression;
import fjord.ast.expr.LazyExpression;
import fjord.ast.expr.ListExpression;
import fjord.ast.expr.MatchExpression;
import fjord.ast.expr.MatchingFunctionExpression;
import fjord.ast.expr.NullExpression;
import fjord.ast.expr.ObjectConstruction;
import fjord.ast.expr.RecordCloningExpression;
import fjord.ast.expr.RecordExpression;
import fjord.ast.expr.SimpleForLoop;
import fjord.ast.expr.SimpleObjectExpression;
import fjord.ast.expr.TryFinallyExpression;
import fjord.ast.expr.TryWithExpression;
import fjord.ast.expr.TupleExpression;
import fjord.ast.expr.TypeAnnotationExpression;
import fjord.ast.expr.TypeApplicationExpression;
import fjord.ast.expr.UpcastExpression;
import fjord.ast.expr.ValueDefinitionExpression;
import fjord.ast.expr.WhileExpression;
import fjord.ast.pat.ArrayPattern;
import fjord.ast.pat.AsPattern;
import fjord.ast.pat.AttributedPattern;
import fjord.ast.pat.ConjunctivePattern;
import fjord.ast.pat.ConsPattern;
import fjord.ast.pat.ConstantPattern;
import fjord.ast.pat.DisjunctivePattern;
import fjord.ast.pat.DynamicTypeTestPattern;
import fjord.ast.pat.FieldPattern;
import fjord.ast.pat.ListPattern;
import fjord.ast.pat.NamedPattern;
import fjord.ast.pat.NullTestPattern;
import fjord.ast.pat.RecordPattern;
import fjord.ast.pat.TuplePattern;
import fjord.ast.pat.TypeConstrainedPattern;
import fjord.ast.pat.WildcardPattern;
import fjord.ast.patparam.ConstantPatParam;
import fjord.ast.patparam.IdentParamPatParam;
import fjord.ast.patparam.IdentPatParam;
import fjord.ast.patparam.ListPatParam;
import fjord.ast.patparam.NullPatParam;
import fjord.ast.patparam.TuplePatParam;
import fjord.ast.patparam.TypedPatParam;
import fjord.ast.typar.Typar.AnonymousTypeVariable;
import fjord.ast.typar.Typar.StaticHeadTypeVariable;
import fjord.ast.typar.Typar.TypeVariable;
import fjord.ast.typar.TyparDefn;
import fjord.ast.typar.TyparDefns;
import fjord.ast.type.AnonymousTypeWithSubtypeConstraint;
import fjord.ast.type.ArrayType;
import fjord.ast.type.ConstrainedType;
import fjord.ast.type.FunctionType;
import fjord.ast.type.NamedType;
import fjord.ast.type.TupleType;
import fjord.ast.type.atomic.AnoymousWithSubtypeConstraintAtomicType;
import fjord.ast.type.atomic.TypeLongIdentAtomicType;
import fjord.ast.type.atomic.TypeTypeAtomicType;
import fjord.ast.type.constraint.CoercionConstraint;
import fjord.ast.type.constraint.ComparisonConstraint;
import fjord.ast.type.constraint.DefaultConstructorConstraint;
import fjord.ast.type.constraint.DelegateDecompositionConstraint;
import fjord.ast.type.constraint.EnumDecompositionConstraint;
import fjord.ast.type.constraint.EqualityConstraint;
import fjord.ast.type.constraint.NullnessConstraint;
import fjord.ast.type.constraint.ReferenceTypeConstraint;
import fjord.ast.type.constraint.StructConstraint;
import fjord.ast.type.constraint.UnmanagedConstraint;
import fjord.ast.typedefn.AbbrevTypeDefn;
import fjord.ast.typedefn.ArgSpec;
import fjord.ast.typedefn.ClassInheritsDecl;
import fjord.ast.typedefn.CurriedSig;
import fjord.ast.typedefn.DelegateTypeDefn;
import fjord.ast.typedefn.EnumTypeCase;
import fjord.ast.typedefn.EnumTypeDefn;
import fjord.ast.typedefn.ExceptionAbbreviation;
import fjord.ast.typedefn.ExceptionDefinition;
import fjord.ast.typedefn.FunctionDefn;
import fjord.ast.typedefn.InterfaceSpec;
import fjord.ast.typedefn.InterfaceTypeDefn;
import fjord.ast.typedefn.MemberSig;
import fjord.ast.typedefn.NAryUnionCase;
import fjord.ast.typedefn.NullaryUnionCase;
import fjord.ast.typedefn.RecordTypeDefn;
import fjord.ast.typedefn.TypeExtension;
import fjord.ast.typedefn.UncurriedSig;
import fjord.ast.typedefn.UncurriedSigUnionCase;
import fjord.ast.typedefn.UnionTypeCase;
import fjord.ast.typedefn.UnionTypeDefn;


public interface NodeVisitor {
  void visit(CompilerDirectiveDecl node);
  void visit(Const node);
  void visit(Ident node);
  void visit(ImportDecl node);
  void visit(ScriptFragment node);
  void visit(ValueDefn node);
  void visit(ApplicationExpression applicationExpression);
  void visit(ArrayExpression arrayExpression);
  void visit(AssertExpression assertExpression);
  void visit(AssignmentExpression assignmentExpression);
  void visit(BaseCall baseCall);
  void visit(ConstantExpression constantExpression);
  void visit(DeterministicDisposalExpression deterministicDisposalExpression);
  void visit(DotLookupExpression dotLookupExpression);
  void visit(DowncastExpression downcastExpression);
  void visit(ElifBranch elifBranch);
  void visit(FieldInitializer fieldInitializer);
  void visit(FunctionDefinitionExpression functionDefinitionExpression);
  void visit(IfExpression ifExpression);
  void visit(LazyExpression lazyExpression);
  void visit(ListExpression listExpression);
  void visit(MatchExpression matchExpression);
  void visit(MatchingFunctionExpression matchingFunctionExpression);
  void visit(NullExpression nullExpression);
  void visit(ObjectConstruction objectConstruction);
  void visit(RecordCloningExpression recordCloningExpression);
  void visit(RecordExpression recordExpression);
  void visit(SimpleForLoop simpleForLoop);
  void visit(SimpleObjectExpression simpleObjectExpression);
  void visit(TryFinallyExpression tryFinallyExpression);
  void visit(TryWithExpression tryWithExpression);
  void visit(TupleExpression tupleExpression);
  void visit(TypeAnnotationExpression typeAnnotationExpression);
  void visit(TypeApplicationExpression typeApplicationExpression);
  void visit(UpcastExpression upcastExpression);
  void visit(ValueDefinitionExpression valueDefinitionExpression);
  void visit(WhileExpression whileExpression);
  
  void visit(ArrayPattern arrayPattern);
  void visit(AsPattern asPattern);
  void visit(AttributedPattern attributedPattern);
  void visit(ConjunctivePattern conjunctivePattern);
  void visit(ConsPattern consPattern);
  void visit(ConstantPattern constantPattern);
  void visit(DisjunctivePattern disjunctivePattern);
  void visit(DynamicTypeTestPattern dynamicTypeTestPattern);
  void visit(FieldPattern fieldPattern);
  void visit(ListPattern listPattern);
  void visit(NamedPattern namedPattern);
  void visit(NullTestPattern nullTestPattern);
  void visit(RecordPattern recordPattern);
  void visit(TuplePattern tuplePattern);
  void visit(TypeConstrainedPattern typeConstrainedPattern);
  void visit(WildcardPattern wildcardPattern);
  
  void visit(ConstantPatParam constantPatParam);
  void visit(IdentParamPatParam identParamPatParam);
  void visit(IdentPatParam identPatParam);
  void visit(ListPatParam listPatParam);
  void visit(NullPatParam nullPatParam);
  void visit(TuplePatParam tuplePatParam);
  void visit(TypedPatParam typedPatParam);
  
  void visit(TypeVariable typeVariable);
  void visit(StaticHeadTypeVariable staticHeadTypeVariable);
  void visit(AnonymousTypeVariable anonymousTypeVariable);
  
  void visit(TyparDefn typarDefn);
  void visit(TyparDefns typarDefns);
  void visit(
      AnoymousWithSubtypeConstraintAtomicType anoymousWithSubtypeConstraintAtomicType);
  void visit(TypeLongIdentAtomicType typeLongIdentAtomicType);
  void visit(TypeTypeAtomicType typeTypeAtomicType);
  
  void visit(CoercionConstraint coercionConstraint);
  void visit(ComparisonConstraint comparisonConstraint);
  void visit(DefaultConstructorConstraint defaultConstructorConstraint);
  void visit(DelegateDecompositionConstraint delegateDecompositionConstraint);
  void visit(EnumDecompositionConstraint enumDecompositionConstraint);
  void visit(EqualityConstraint equalityConstraint);
  void visit(NullnessConstraint nullnessConstraint);
  void visit(ReferenceTypeConstraint referenceTypeConstraint);
  void visit(StructConstraint structConstraint);
  void visit(UnmanagedConstraint unmanagedConstraint);
  
  void visit(
      AnonymousTypeWithSubtypeConstraint anonymousTypeWithSubtypeConstraint);
  void visit(ArrayType arrayType);
  void visit(ConstrainedType constrainedType);
  void visit(FunctionType functionType);
  void visit(NamedType namedType);
  void visit(TupleType tupleType);
  
  void visit(AbbrevTypeDefn abbrevTypeDefn);
  void visit(ArgSpec argSpec);
  void visit(ClassInheritsDecl classInheritsDecl);
  void visit(CurriedSig curriedSig);
  void visit(DelegateTypeDefn delegateTypeDefn);
  void visit(EnumTypeCase enumTypeCase);
  void visit(EnumTypeDefn enumTypeDefn);
  void visit(ExceptionAbbreviation exceptionAbbreviation);
  void visit(ExceptionDefinition exceptionDefinition);
  void visit(FunctionDefn functionDefn);
  void visit(InterfaceSpec interfaceSpec);
  void visit(InterfaceTypeDefn interfaceTypeDefn);
  void visit(MemberSig memberSig);
  void visit(NAryUnionCase nAryUnionCase);
  void visit(NullaryUnionCase nullaryUnionCase);
  void visit(RecordTypeDefn recordTypeDefn);
  void visit(TypeExtension typeExtension);
  void visit(UncurriedSig uncurriedSig);
  void visit(UncurriedSigUnionCase uncurriedSigUnionCase);
  void visit(UnionTypeCase unionTypeCase);
  void visit(UnionTypeDefn unionTypeDefn);
  
  void visit(AnonymousModule anonymousModule);
  void visit(ModuleAbbrev moduleAbbrev);
  
  void visit(ModuleFunctionDefinition moduleFunctionDefinition);
  
  
  
  
}
