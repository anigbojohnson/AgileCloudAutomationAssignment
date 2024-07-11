/**
 * generated by Xtext 2.32.0
 */
package org.xtext.example.mydsl1.myDsl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.example.mydsl1.myDsl.MyDslPackage
 * @generated
 */
public interface MyDslFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  MyDslFactory eINSTANCE = org.xtext.example.mydsl1.myDsl.impl.MyDslFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Mongo DB</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Mongo DB</em>'.
   * @generated
   */
  MongoDB createMongoDB();

  /**
   * Returns a new object of class '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model</em>'.
   * @generated
   */
  Model createModel();

  /**
   * Returns a new object of class '<em>Operation Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Operation Statement</em>'.
   * @generated
   */
  OperationStatement createOperationStatement();

  /**
   * Returns a new object of class '<em>Connection Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Connection Statement</em>'.
   * @generated
   */
  ConnectionStatement createConnectionStatement();

  /**
   * Returns a new object of class '<em>Make Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Make Statement</em>'.
   * @generated
   */
  MakeStatement createMakeStatement();

  /**
   * Returns a new object of class '<em>Dictionary Entry</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Dictionary Entry</em>'.
   * @generated
   */
  DictionaryEntry createDictionaryEntry();

  /**
   * Returns a new object of class '<em>Other Operation Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Other Operation Statement</em>'.
   * @generated
   */
  OtherOperationStatement createOtherOperationStatement();

  /**
   * Returns a new object of class '<em>Task Dictionary Entry</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Task Dictionary Entry</em>'.
   * @generated
   */
  TaskDictionaryEntry createTaskDictionaryEntry();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  MyDslPackage getMyDslPackage();

} //MyDslFactory