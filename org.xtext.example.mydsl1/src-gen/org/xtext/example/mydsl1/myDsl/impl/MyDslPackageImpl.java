/**
 * generated by Xtext 2.32.0
 */
package org.xtext.example.mydsl1.myDsl.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.xtext.example.mydsl1.myDsl.CRUDOperationAndCollectionSchema;
import org.xtext.example.mydsl1.myDsl.CRUDOperations;
import org.xtext.example.mydsl1.myDsl.CollectionEntry;
import org.xtext.example.mydsl1.myDsl.CollectionFieldDefination;
import org.xtext.example.mydsl1.myDsl.CollectionSchema;
import org.xtext.example.mydsl1.myDsl.ConnectionStatement;
import org.xtext.example.mydsl1.myDsl.FieldType;
import org.xtext.example.mydsl1.myDsl.Model;
import org.xtext.example.mydsl1.myDsl.MongoDB;
import org.xtext.example.mydsl1.myDsl.MyDslFactory;
import org.xtext.example.mydsl1.myDsl.MyDslPackage;
import org.xtext.example.mydsl1.myDsl.UpdateCollectionEntry;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MyDslPackageImpl extends EPackageImpl implements MyDslPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mongoDBEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass crudOperationAndCollectionSchemaEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass connectionStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass collectionSchemaEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass collectionFieldDefinationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass crudOperationsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass updateCollectionEntryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass collectionEntryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum fieldTypeEEnum = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.xtext.example.mydsl1.myDsl.MyDslPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private MyDslPackageImpl()
  {
    super(eNS_URI, MyDslFactory.eINSTANCE);
  }
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   *
   * <p>This method is used to initialize {@link MyDslPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static MyDslPackage init()
  {
    if (isInited) return (MyDslPackage)EPackage.Registry.INSTANCE.getEPackage(MyDslPackage.eNS_URI);

    // Obtain or create and register package
    Object registeredMyDslPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
    MyDslPackageImpl theMyDslPackage = registeredMyDslPackage instanceof MyDslPackageImpl ? (MyDslPackageImpl)registeredMyDslPackage : new MyDslPackageImpl();

    isInited = true;

    // Create package meta-data objects
    theMyDslPackage.createPackageContents();

    // Initialize created meta-data
    theMyDslPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theMyDslPackage.freeze();

    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(MyDslPackage.eNS_URI, theMyDslPackage);
    return theMyDslPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getMongoDB()
  {
    return mongoDBEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getMongoDB_Models()
  {
    return (EReference)mongoDBEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getModel()
  {
    return modelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getModel_Connection()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getModel_Statements()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getCRUDOperationAndCollectionSchema()
  {
    return crudOperationAndCollectionSchemaEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getCRUDOperationAndCollectionSchema_Schema()
  {
    return (EReference)crudOperationAndCollectionSchemaEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getCRUDOperationAndCollectionSchema_Operations()
  {
    return (EReference)crudOperationAndCollectionSchemaEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getConnectionStatement()
  {
    return connectionStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getConnectionStatement_ConnectionString()
  {
    return (EAttribute)connectionStatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getConnectionStatement_DatabaseName()
  {
    return (EAttribute)connectionStatementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getCollectionSchema()
  {
    return collectionSchemaEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getCollectionSchema_Name()
  {
    return (EAttribute)collectionSchemaEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getCollectionSchema_Defination()
  {
    return (EReference)collectionSchemaEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getCollectionFieldDefination()
  {
    return collectionFieldDefinationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getCollectionFieldDefination_Name()
  {
    return (EAttribute)collectionFieldDefinationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getCollectionFieldDefination_FieldType()
  {
    return (EAttribute)collectionFieldDefinationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getCollectionFieldDefination_Status()
  {
    return (EAttribute)collectionFieldDefinationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getCollectionFieldDefination_UniqueKey()
  {
    return (EAttribute)collectionFieldDefinationEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getCollectionFieldDefination_RefCollection()
  {
    return (EReference)collectionFieldDefinationEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getCRUDOperations()
  {
    return crudOperationsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getCRUDOperations_Name()
  {
    return (EAttribute)crudOperationsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getCRUDOperations_Type()
  {
    return (EAttribute)crudOperationsEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getCRUDOperations_Collection()
  {
    return (EReference)crudOperationsEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getCRUDOperations_Entries()
  {
    return (EReference)crudOperationsEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getUpdateCollectionEntry()
  {
    return updateCollectionEntryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getUpdateCollectionEntry_ValueName()
  {
    return (EAttribute)updateCollectionEntryEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getUpdateCollectionEntry_ValueString()
  {
    return (EAttribute)updateCollectionEntryEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getUpdateCollectionEntry_ValueInt()
  {
    return (EAttribute)updateCollectionEntryEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getCollectionEntry()
  {
    return collectionEntryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getCollectionEntry_ValueName()
  {
    return (EAttribute)collectionEntryEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getCollectionEntry_ValueString()
  {
    return (EAttribute)collectionEntryEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getCollectionEntry_ValueInt()
  {
    return (EAttribute)collectionEntryEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EEnum getFieldType()
  {
    return fieldTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MyDslFactory getMyDslFactory()
  {
    return (MyDslFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    mongoDBEClass = createEClass(MONGO_DB);
    createEReference(mongoDBEClass, MONGO_DB__MODELS);

    modelEClass = createEClass(MODEL);
    createEReference(modelEClass, MODEL__CONNECTION);
    createEReference(modelEClass, MODEL__STATEMENTS);

    crudOperationAndCollectionSchemaEClass = createEClass(CRUD_OPERATION_AND_COLLECTION_SCHEMA);
    createEReference(crudOperationAndCollectionSchemaEClass, CRUD_OPERATION_AND_COLLECTION_SCHEMA__SCHEMA);
    createEReference(crudOperationAndCollectionSchemaEClass, CRUD_OPERATION_AND_COLLECTION_SCHEMA__OPERATIONS);

    connectionStatementEClass = createEClass(CONNECTION_STATEMENT);
    createEAttribute(connectionStatementEClass, CONNECTION_STATEMENT__CONNECTION_STRING);
    createEAttribute(connectionStatementEClass, CONNECTION_STATEMENT__DATABASE_NAME);

    collectionSchemaEClass = createEClass(COLLECTION_SCHEMA);
    createEAttribute(collectionSchemaEClass, COLLECTION_SCHEMA__NAME);
    createEReference(collectionSchemaEClass, COLLECTION_SCHEMA__DEFINATION);

    collectionFieldDefinationEClass = createEClass(COLLECTION_FIELD_DEFINATION);
    createEAttribute(collectionFieldDefinationEClass, COLLECTION_FIELD_DEFINATION__NAME);
    createEAttribute(collectionFieldDefinationEClass, COLLECTION_FIELD_DEFINATION__FIELD_TYPE);
    createEAttribute(collectionFieldDefinationEClass, COLLECTION_FIELD_DEFINATION__STATUS);
    createEAttribute(collectionFieldDefinationEClass, COLLECTION_FIELD_DEFINATION__UNIQUE_KEY);
    createEReference(collectionFieldDefinationEClass, COLLECTION_FIELD_DEFINATION__REF_COLLECTION);

    crudOperationsEClass = createEClass(CRUD_OPERATIONS);
    createEAttribute(crudOperationsEClass, CRUD_OPERATIONS__NAME);
    createEAttribute(crudOperationsEClass, CRUD_OPERATIONS__TYPE);
    createEReference(crudOperationsEClass, CRUD_OPERATIONS__COLLECTION);
    createEReference(crudOperationsEClass, CRUD_OPERATIONS__ENTRIES);

    updateCollectionEntryEClass = createEClass(UPDATE_COLLECTION_ENTRY);
    createEAttribute(updateCollectionEntryEClass, UPDATE_COLLECTION_ENTRY__VALUE_NAME);
    createEAttribute(updateCollectionEntryEClass, UPDATE_COLLECTION_ENTRY__VALUE_STRING);
    createEAttribute(updateCollectionEntryEClass, UPDATE_COLLECTION_ENTRY__VALUE_INT);

    collectionEntryEClass = createEClass(COLLECTION_ENTRY);
    createEAttribute(collectionEntryEClass, COLLECTION_ENTRY__VALUE_NAME);
    createEAttribute(collectionEntryEClass, COLLECTION_ENTRY__VALUE_STRING);
    createEAttribute(collectionEntryEClass, COLLECTION_ENTRY__VALUE_INT);

    // Create enums
    fieldTypeEEnum = createEEnum(FIELD_TYPE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes

    // Initialize classes and features; add operations and parameters
    initEClass(mongoDBEClass, MongoDB.class, "MongoDB", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMongoDB_Models(), this.getModel(), null, "models", null, 0, -1, MongoDB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getModel_Connection(), this.getConnectionStatement(), null, "connection", null, 0, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModel_Statements(), this.getCRUDOperationAndCollectionSchema(), null, "statements", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(crudOperationAndCollectionSchemaEClass, CRUDOperationAndCollectionSchema.class, "CRUDOperationAndCollectionSchema", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCRUDOperationAndCollectionSchema_Schema(), this.getCollectionSchema(), null, "schema", null, 0, 1, CRUDOperationAndCollectionSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCRUDOperationAndCollectionSchema_Operations(), this.getCRUDOperations(), null, "operations", null, 0, -1, CRUDOperationAndCollectionSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(connectionStatementEClass, ConnectionStatement.class, "ConnectionStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getConnectionStatement_ConnectionString(), ecorePackage.getEString(), "connectionString", null, 0, 1, ConnectionStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getConnectionStatement_DatabaseName(), ecorePackage.getEString(), "databaseName", null, 0, 1, ConnectionStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(collectionSchemaEClass, CollectionSchema.class, "CollectionSchema", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCollectionSchema_Name(), ecorePackage.getEString(), "name", null, 0, 1, CollectionSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCollectionSchema_Defination(), this.getCollectionFieldDefination(), null, "defination", null, 0, -1, CollectionSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(collectionFieldDefinationEClass, CollectionFieldDefination.class, "CollectionFieldDefination", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCollectionFieldDefination_Name(), ecorePackage.getEString(), "name", null, 0, 1, CollectionFieldDefination.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCollectionFieldDefination_FieldType(), this.getFieldType(), "fieldType", null, 0, 1, CollectionFieldDefination.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCollectionFieldDefination_Status(), ecorePackage.getEBoolean(), "status", null, 0, 1, CollectionFieldDefination.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCollectionFieldDefination_UniqueKey(), ecorePackage.getEBoolean(), "uniqueKey", null, 0, 1, CollectionFieldDefination.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCollectionFieldDefination_RefCollection(), this.getCollectionSchema(), null, "refCollection", null, 0, 1, CollectionFieldDefination.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(crudOperationsEClass, CRUDOperations.class, "CRUDOperations", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCRUDOperations_Name(), ecorePackage.getEString(), "name", null, 0, 1, CRUDOperations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCRUDOperations_Type(), ecorePackage.getEString(), "type", null, 0, 1, CRUDOperations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCRUDOperations_Collection(), this.getCollectionSchema(), null, "collection", null, 0, 1, CRUDOperations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCRUDOperations_Entries(), ecorePackage.getEObject(), null, "entries", null, 0, -1, CRUDOperations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(updateCollectionEntryEClass, UpdateCollectionEntry.class, "UpdateCollectionEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getUpdateCollectionEntry_ValueName(), ecorePackage.getEString(), "valueName", null, 0, 1, UpdateCollectionEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getUpdateCollectionEntry_ValueString(), ecorePackage.getEString(), "valueString", null, 0, 1, UpdateCollectionEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getUpdateCollectionEntry_ValueInt(), ecorePackage.getEInt(), "valueInt", null, 0, 1, UpdateCollectionEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(collectionEntryEClass, CollectionEntry.class, "CollectionEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCollectionEntry_ValueName(), ecorePackage.getEString(), "valueName", null, 0, 1, CollectionEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCollectionEntry_ValueString(), ecorePackage.getEString(), "valueString", null, 0, 1, CollectionEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCollectionEntry_ValueInt(), ecorePackage.getEInt(), "valueInt", null, 0, 1, CollectionEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(fieldTypeEEnum, FieldType.class, "FieldType");
    addEEnumLiteral(fieldTypeEEnum, FieldType.STRING);
    addEEnumLiteral(fieldTypeEEnum, FieldType.NUMBER);
    addEEnumLiteral(fieldTypeEEnum, FieldType.BOOLEAN);
    addEEnumLiteral(fieldTypeEEnum, FieldType.DATE);

    // Create resource
    createResource(eNS_URI);
  }

} //MyDslPackageImpl
