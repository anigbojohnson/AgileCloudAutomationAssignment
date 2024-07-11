/**
 * generated by Xtext 2.32.0
 */
package org.xtext.example.mydsl1.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl1.myDsl.OperationStatement#getSchema <em>Schema</em>}</li>
 *   <li>{@link org.xtext.example.mydsl1.myDsl.OperationStatement#getOperations <em>Operations</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl1.myDsl.MyDslPackage#getOperationStatement()
 * @model
 * @generated
 */
public interface OperationStatement extends EObject
{
  /**
   * Returns the value of the '<em><b>Schema</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Schema</em>' containment reference.
   * @see #setSchema(MakeStatement)
   * @see org.xtext.example.mydsl1.myDsl.MyDslPackage#getOperationStatement_Schema()
   * @model containment="true"
   * @generated
   */
  MakeStatement getSchema();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl1.myDsl.OperationStatement#getSchema <em>Schema</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Schema</em>' containment reference.
   * @see #getSchema()
   * @generated
   */
  void setSchema(MakeStatement value);

  /**
   * Returns the value of the '<em><b>Operations</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl1.myDsl.OtherOperationStatement}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operations</em>' containment reference list.
   * @see org.xtext.example.mydsl1.myDsl.MyDslPackage#getOperationStatement_Operations()
   * @model containment="true"
   * @generated
   */
  EList<OtherOperationStatement> getOperations();

} // OperationStatement
