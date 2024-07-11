/**
 * generated by Xtext 2.32.0
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Collection Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.CollectionEntry#getValueName <em>Value Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.CollectionEntry#getValueString <em>Value String</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.CollectionEntry#getValueInt <em>Value Int</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getCollectionEntry()
 * @model
 * @generated
 */
public interface CollectionEntry extends EObject
{
  /**
   * Returns the value of the '<em><b>Value Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value Name</em>' attribute.
   * @see #setValueName(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getCollectionEntry_ValueName()
   * @model
   * @generated
   */
  String getValueName();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.CollectionEntry#getValueName <em>Value Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value Name</em>' attribute.
   * @see #getValueName()
   * @generated
   */
  void setValueName(String value);

  /**
   * Returns the value of the '<em><b>Value String</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value String</em>' attribute.
   * @see #setValueString(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getCollectionEntry_ValueString()
   * @model
   * @generated
   */
  String getValueString();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.CollectionEntry#getValueString <em>Value String</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value String</em>' attribute.
   * @see #getValueString()
   * @generated
   */
  void setValueString(String value);

  /**
   * Returns the value of the '<em><b>Value Int</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value Int</em>' attribute.
   * @see #setValueInt(int)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getCollectionEntry_ValueInt()
   * @model
   * @generated
   */
  int getValueInt();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.CollectionEntry#getValueInt <em>Value Int</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value Int</em>' attribute.
   * @see #getValueInt()
   * @generated
   */
  void setValueInt(int value);

} // CollectionEntry
