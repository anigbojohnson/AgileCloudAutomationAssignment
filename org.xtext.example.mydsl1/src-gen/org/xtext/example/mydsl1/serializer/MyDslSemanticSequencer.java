/*
 * generated by Xtext 2.32.0
 */
package org.xtext.example.mydsl1.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.xtext.example.mydsl1.myDsl.CRUDOperationAndCollectionSchema;
import org.xtext.example.mydsl1.myDsl.CRUDOperations;
import org.xtext.example.mydsl1.myDsl.CollectionEntry;
import org.xtext.example.mydsl1.myDsl.CollectionFieldDefination;
import org.xtext.example.mydsl1.myDsl.CollectionSchema;
import org.xtext.example.mydsl1.myDsl.ConnectionStatement;
import org.xtext.example.mydsl1.myDsl.Model;
import org.xtext.example.mydsl1.myDsl.MongoDB;
import org.xtext.example.mydsl1.myDsl.MyDslPackage;
import org.xtext.example.mydsl1.myDsl.UpdateCollectionEntry;
import org.xtext.example.mydsl1.services.MyDslGrammarAccess;

@SuppressWarnings("all")
public class MyDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private MyDslGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == MyDslPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case MyDslPackage.CRUD_OPERATION_AND_COLLECTION_SCHEMA:
				sequence_CRUDOperationAndCollectionSchema(context, (CRUDOperationAndCollectionSchema) semanticObject); 
				return; 
			case MyDslPackage.CRUD_OPERATIONS:
				sequence_CRUDOperations(context, (CRUDOperations) semanticObject); 
				return; 
			case MyDslPackage.COLLECTION_ENTRY:
				sequence_CollectionEntry(context, (CollectionEntry) semanticObject); 
				return; 
			case MyDslPackage.COLLECTION_FIELD_DEFINATION:
				sequence_CollectionFieldDefination(context, (CollectionFieldDefination) semanticObject); 
				return; 
			case MyDslPackage.COLLECTION_SCHEMA:
				sequence_CollectionSchema(context, (CollectionSchema) semanticObject); 
				return; 
			case MyDslPackage.CONNECTION_STATEMENT:
				sequence_ConnectionStatement(context, (ConnectionStatement) semanticObject); 
				return; 
			case MyDslPackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case MyDslPackage.MONGO_DB:
				sequence_MongoDB(context, (MongoDB) semanticObject); 
				return; 
			case MyDslPackage.UPDATE_COLLECTION_ENTRY:
				sequence_UpdateCollectionEntry(context, (UpdateCollectionEntry) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * <pre>
	 * Contexts:
	 *     CRUDOperationAndCollectionSchema returns CRUDOperationAndCollectionSchema
	 *
	 * Constraint:
	 *     (schema=CollectionSchema operations+=CRUDOperations*)
	 * </pre>
	 */
	protected void sequence_CRUDOperationAndCollectionSchema(ISerializationContext context, CRUDOperationAndCollectionSchema semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     CRUDOperations returns CRUDOperations
	 *
	 * Constraint:
	 *     (
	 *         (name=ID type=Operation collection=[CollectionSchema|ID] (entries+=CollectionEntry entries+=CollectionEntry*)?) | 
	 *         (
	 *             name=ID 
	 *             type='UPDATE' 
	 *             collection=[CollectionSchema|ID] 
	 *             entries+=CollectionEntry 
	 *             entries+=CollectionEntry* 
	 *             entries+=UpdateCollectionEntry 
	 *             entries+=UpdateCollectionEntry*
	 *         )
	 *     )
	 * </pre>
	 */
	protected void sequence_CRUDOperations(ISerializationContext context, CRUDOperations semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     CollectionEntry returns CollectionEntry
	 *
	 * Constraint:
	 *     (valueName=ID (valueString=STRING | valueInt=INT))
	 * </pre>
	 */
	protected void sequence_CollectionEntry(ISerializationContext context, CollectionEntry semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     CollectionFieldDefination returns CollectionFieldDefination
	 *
	 * Constraint:
	 *     ((name=ID fieldType=FieldType status?='required'? uniqueKey?='unique'?) | (name=ID refCollection=[CollectionSchema|ID]))
	 * </pre>
	 */
	protected void sequence_CollectionFieldDefination(ISerializationContext context, CollectionFieldDefination semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     CollectionSchema returns CollectionSchema
	 *
	 * Constraint:
	 *     (name=ID (defination+=CollectionFieldDefination defination+=CollectionFieldDefination*)?)
	 * </pre>
	 */
	protected void sequence_CollectionSchema(ISerializationContext context, CollectionSchema semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     ConnectionStatement returns ConnectionStatement
	 *
	 * Constraint:
	 *     (connectionString=STRING | databaseName=STRING)+
	 * </pre>
	 */
	protected void sequence_ConnectionStatement(ISerializationContext context, ConnectionStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Model returns Model
	 *
	 * Constraint:
	 *     (connection=ConnectionStatement statements+=CRUDOperationAndCollectionSchema*)
	 * </pre>
	 */
	protected void sequence_Model(ISerializationContext context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     MongoDB returns MongoDB
	 *
	 * Constraint:
	 *     models+=Model+
	 * </pre>
	 */
	protected void sequence_MongoDB(ISerializationContext context, MongoDB semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     UpdateCollectionEntry returns UpdateCollectionEntry
	 *
	 * Constraint:
	 *     (valueName=ID (valueString=STRING | valueInt=INT))
	 * </pre>
	 */
	protected void sequence_UpdateCollectionEntry(ISerializationContext context, UpdateCollectionEntry semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}