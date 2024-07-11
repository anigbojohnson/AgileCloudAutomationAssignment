/**
 * generated by Xtext 2.32.0
 */
package org.xtext.example.mydsl2.myDsl.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.example.mydsl2.myDsl.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MyDslFactoryImpl extends EFactoryImpl implements MyDslFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static MyDslFactory init()
  {
    try
    {
      MyDslFactory theMyDslFactory = (MyDslFactory)EPackage.Registry.INSTANCE.getEFactory(MyDslPackage.eNS_URI);
      if (theMyDslFactory != null)
      {
        return theMyDslFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new MyDslFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MyDslFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case MyDslPackage.MONGO_DB: return createMongoDB();
      case MyDslPackage.MODEL: return createModel();
      case MyDslPackage.OPERATION_STATEMENT: return createOperationStatement();
      case MyDslPackage.CONNECTION_STATEMENT: return createConnectionStatement();
      case MyDslPackage.MAKE_STATEMENT: return createMakeStatement();
      case MyDslPackage.DICTIONARY_ENTRY: return createDictionaryEntry();
      case MyDslPackage.OTHER_OPERATION_STATEMENT: return createOtherOperationStatement();
      case MyDslPackage.TASK_DICTIONARY_ENTRY: return createTaskDictionaryEntry();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MongoDB createMongoDB()
  {
    MongoDBImpl mongoDB = new MongoDBImpl();
    return mongoDB;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public OperationStatement createOperationStatement()
  {
    OperationStatementImpl operationStatement = new OperationStatementImpl();
    return operationStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ConnectionStatement createConnectionStatement()
  {
    ConnectionStatementImpl connectionStatement = new ConnectionStatementImpl();
    return connectionStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MakeStatement createMakeStatement()
  {
    MakeStatementImpl makeStatement = new MakeStatementImpl();
    return makeStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DictionaryEntry createDictionaryEntry()
  {
    DictionaryEntryImpl dictionaryEntry = new DictionaryEntryImpl();
    return dictionaryEntry;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public OtherOperationStatement createOtherOperationStatement()
  {
    OtherOperationStatementImpl otherOperationStatement = new OtherOperationStatementImpl();
    return otherOperationStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TaskDictionaryEntry createTaskDictionaryEntry()
  {
    TaskDictionaryEntryImpl taskDictionaryEntry = new TaskDictionaryEntryImpl();
    return taskDictionaryEntry;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MyDslPackage getMyDslPackage()
  {
    return (MyDslPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static MyDslPackage getPackage()
  {
    return MyDslPackage.eINSTANCE;
  }

} //MyDslFactoryImpl