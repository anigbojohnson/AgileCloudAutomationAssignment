/**
 * generated by Xtext 2.32.0
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Collection Schema</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.CollectionSchema#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.CollectionSchema#getDefination <em>Defination</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getCollectionSchema()
 * @model
 * @generated
 */
public interface CollectionSchema extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getCollectionSchema_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.CollectionSchema#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Defination</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.CollectionFieldDefination}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Defination</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getCollectionSchema_Defination()
   * @model containment="true"
   * @generated
   */
  EList<CollectionFieldDefination> getDefination();

} // CollectionSchema
