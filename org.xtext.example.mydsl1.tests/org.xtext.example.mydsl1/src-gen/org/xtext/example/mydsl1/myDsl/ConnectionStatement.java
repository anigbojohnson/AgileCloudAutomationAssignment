/**
 * generated by Xtext 2.32.0
 */
package org.xtext.example.mydsl1.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connection Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl1.myDsl.ConnectionStatement#getConnectionString <em>Connection String</em>}</li>
 *   <li>{@link org.xtext.example.mydsl1.myDsl.ConnectionStatement#getDatabase <em>Database</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl1.myDsl.MyDslPackage#getConnectionStatement()
 * @model
 * @generated
 */
public interface ConnectionStatement extends EObject
{
  /**
   * Returns the value of the '<em><b>Connection String</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Connection String</em>' attribute.
   * @see #setConnectionString(String)
   * @see org.xtext.example.mydsl1.myDsl.MyDslPackage#getConnectionStatement_ConnectionString()
   * @model
   * @generated
   */
  String getConnectionString();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl1.myDsl.ConnectionStatement#getConnectionString <em>Connection String</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Connection String</em>' attribute.
   * @see #getConnectionString()
   * @generated
   */
  void setConnectionString(String value);

  /**
   * Returns the value of the '<em><b>Database</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Database</em>' attribute.
   * @see #setDatabase(String)
   * @see org.xtext.example.mydsl1.myDsl.MyDslPackage#getConnectionStatement_Database()
   * @model
   * @generated
   */
  String getDatabase();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl1.myDsl.ConnectionStatement#getDatabase <em>Database</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Database</em>' attribute.
   * @see #getDatabase()
   * @generated
   */
  void setDatabase(String value);

} // ConnectionStatement
