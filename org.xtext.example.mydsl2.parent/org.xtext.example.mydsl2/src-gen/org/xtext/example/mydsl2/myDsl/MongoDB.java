/**
 * generated by Xtext 2.32.0
 */
package org.xtext.example.mydsl2.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mongo DB</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl2.myDsl.MongoDB#getModels <em>Models</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl2.myDsl.MyDslPackage#getMongoDB()
 * @model
 * @generated
 */
public interface MongoDB extends EObject
{
  /**
   * Returns the value of the '<em><b>Models</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl2.myDsl.Model}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Models</em>' containment reference list.
   * @see org.xtext.example.mydsl2.myDsl.MyDslPackage#getMongoDB_Models()
   * @model containment="true"
   * @generated
   */
  EList<Model> getModels();

} // MongoDB
