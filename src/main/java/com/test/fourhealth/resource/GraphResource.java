package com.test.fourhealth.resource;

import graphql.GraphQL;
import graphql.schema.GraphQLSchema;
import graphql.schema.idl.RuntimeWiring;
import graphql.schema.idl.SchemaGenerator;
import graphql.schema.idl.SchemaParser;
import graphql.schema.idl.TypeDefinitionRegistry;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.io.File;
import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("${uri.api}/${uri.version}/${uri.resource}")
@Slf4j
public class GraphResource {

    @Value("${graphql.files}")
    private List<String> graphQLFiles;

    // .graphql 파일 위치
    @Value("${graphql.path}")
    private String graphQlPath;

    private GraphQL graphQL;

    @PostConstruct
    public void loadSchema(){

        log.info("The GraphQL loadSchema ##########");

        TypeDefinitionRegistry registry = new TypeDefinitionRegistry();
        SchemaParser parser = new SchemaParser();

        for(String fileName : graphQLFiles){
            File schemaFile = new File(graphQlPath+"/"+fileName);
            registry.merge(parser.parse(schemaFile));
        }

        GraphQLSchema schema = new SchemaGenerator().makeExecutableSchema(registry, buildWiring(registry));

        graphQL = GraphQL.newGraphQL(schema).build();
    }

    private RuntimeWiring buildWiring(TypeDefinitionRegistry registry){

        return RuntimeWiring.newRuntimeWiring().build();
    }


}
