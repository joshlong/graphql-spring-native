package org.springframework.experimental.graphql;

import graphql.GraphQL;
import graphql.analysis.QueryVisitorFieldArgumentEnvironment;
import graphql.analysis.QueryVisitorFieldArgumentInputValue;
import graphql.execution.Execution;
import graphql.execution.nextgen.result.RootExecutionResultNode;
import graphql.language.*;
import graphql.parser.ParserOptions;
import graphql.schema.*;
import graphql.schema.validation.SchemaValidationErrorCollector;
import graphql.util.NodeAdapter;
import graphql.util.NodeZipper;
import org.springframework.nativex.hint.ResourceHint;
import org.springframework.nativex.hint.TypeHint;
import org.springframework.nativex.type.NativeConfiguration;

import java.util.List;

import static org.springframework.nativex.hint.TypeAccess.*;

/**
	* Provides Spring Native hints to support using Spring GraphQL in a Spring Native application.
	*
	* @author <a href="mailto:josh@joshlong.com">Josh Long</a>
	*/
@TypeHint(
	typeNames = {
		"graphql.analysis.QueryTraversalContext",
		"graphql.schema.idl.SchemaParseOrder",
	},
	types = {
		Argument.class,
		ArrayValue.class,
		Boolean.class,
		BooleanValue.class,
		DataFetchingEnvironment.class,
		Directive.class,
		DirectiveDefinition.class,
		DirectiveLocation.class,
		Document.class,
		EnumTypeDefinition.class,
		EnumTypeExtensionDefinition.class,
		EnumValue.class,
		EnumValueDefinition.class,
		Execution.class,
		Field.class,
		FieldDefinition.class,
		FloatValue.class,
		FragmentDefinition.class,
		FragmentSpread.class,
		GraphQL.class,
		GraphQLArgument.class,
		GraphQLCodeRegistry.Builder.class,
		GraphQLDirective.class,
		GraphQLEnumType.class,
		GraphQLEnumValueDefinition.class,
		GraphQLFieldDefinition.class,
		GraphQLInputObjectField.class,
		GraphQLInputObjectType.class,
		GraphQLInterfaceType.class,
		GraphQLList.class,
		GraphQLNamedType.class,
		GraphQLNonNull.class,
		GraphQLObjectType.class,
		GraphQLOutputType.class,
		GraphQLScalarType.class,
		GraphQLSchema.class,
		GraphQLSchemaElement.class,
		GraphQLUnionType.class,
		ImplementingTypeDefinition.class,
		InlineFragment.class,
		InputObjectTypeDefinition.class,
		InputObjectTypeExtensionDefinition.class,
		InputValueDefinition.class,
		IntValue.class,
		InterfaceTypeDefinition.class,
		InterfaceTypeExtensionDefinition.class,
		List.class,
		ListType.class,
		NodeAdapter.class,
		NodeZipper.class,
		NonNullType.class,
		NullValue.class,
		ObjectField.class,
		ObjectTypeDefinition.class,
		ObjectTypeExtensionDefinition.class,
		ObjectValue.class,
		OperationDefinition.class,
		OperationTypeDefinition.class,
		ParserOptions.class,
		QueryVisitorFieldArgumentEnvironment.class,
		QueryVisitorFieldArgumentInputValue.class,
		RootExecutionResultNode.class,
		ScalarTypeDefinition.class,
		ScalarTypeExtensionDefinition.class,
		SchemaDefinition.class,
		SchemaExtensionDefinition.class,
		SchemaValidationErrorCollector.class,
		SelectionSet.class,
		StringValue.class,
		TypeDefinition.class,
		TypeName.class,
		UnionTypeDefinition.class,
		UnionTypeExtensionDefinition.class,
		VariableDefinition.class,
		VariableReference.class,
	}, //
	access = {//
		PUBLIC_CLASSES, PUBLIC_CONSTRUCTORS, PUBLIC_FIELDS, PUBLIC_METHODS,
		DECLARED_CLASSES, DECLARED_CONSTRUCTORS, DECLARED_FIELDS, DECLARED_METHODS
	} //
)
@ResourceHint(patterns = {  "graphiql/index.html"})
public class GraphQlNativeHints implements NativeConfiguration {
}
