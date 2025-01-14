/**
 * generated by Xtext 2.32.0
 */
package org.xtext.example.mydsl1.myDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.mydsl1.myDsl.CRUDOperationAndCollectionSchema;
import org.xtext.example.mydsl1.myDsl.CRUDOperations;
import org.xtext.example.mydsl1.myDsl.CollectionSchema;
import org.xtext.example.mydsl1.myDsl.MyDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CRUD Operation And Collection Schema</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl1.myDsl.impl.CRUDOperationAndCollectionSchemaImpl#getSchema <em>Schema</em>}</li>
 *   <li>{@link org.xtext.example.mydsl1.myDsl.impl.CRUDOperationAndCollectionSchemaImpl#getOperations <em>Operations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CRUDOperationAndCollectionSchemaImpl extends MinimalEObjectImpl.Container implements CRUDOperationAndCollectionSchema
{
  /**
   * The cached value of the '{@link #getSchema() <em>Schema</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSchema()
   * @generated
   * @ordered
   */
  protected CollectionSchema schema;

  /**
   * The cached value of the '{@link #getOperations() <em>Operations</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperations()
   * @generated
   * @ordered
   */
  protected EList<CRUDOperations> operations;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CRUDOperationAndCollectionSchemaImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return MyDslPackage.Literals.CRUD_OPERATION_AND_COLLECTION_SCHEMA;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CollectionSchema getSchema()
  {
    return schema;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSchema(CollectionSchema newSchema, NotificationChain msgs)
  {
    CollectionSchema oldSchema = schema;
    schema = newSchema;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.CRUD_OPERATION_AND_COLLECTION_SCHEMA__SCHEMA, oldSchema, newSchema);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setSchema(CollectionSchema newSchema)
  {
    if (newSchema != schema)
    {
      NotificationChain msgs = null;
      if (schema != null)
        msgs = ((InternalEObject)schema).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.CRUD_OPERATION_AND_COLLECTION_SCHEMA__SCHEMA, null, msgs);
      if (newSchema != null)
        msgs = ((InternalEObject)newSchema).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.CRUD_OPERATION_AND_COLLECTION_SCHEMA__SCHEMA, null, msgs);
      msgs = basicSetSchema(newSchema, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.CRUD_OPERATION_AND_COLLECTION_SCHEMA__SCHEMA, newSchema, newSchema));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<CRUDOperations> getOperations()
  {
    if (operations == null)
    {
      operations = new EObjectContainmentEList<CRUDOperations>(CRUDOperations.class, this, MyDslPackage.CRUD_OPERATION_AND_COLLECTION_SCHEMA__OPERATIONS);
    }
    return operations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case MyDslPackage.CRUD_OPERATION_AND_COLLECTION_SCHEMA__SCHEMA:
        return basicSetSchema(null, msgs);
      case MyDslPackage.CRUD_OPERATION_AND_COLLECTION_SCHEMA__OPERATIONS:
        return ((InternalEList<?>)getOperations()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case MyDslPackage.CRUD_OPERATION_AND_COLLECTION_SCHEMA__SCHEMA:
        return getSchema();
      case MyDslPackage.CRUD_OPERATION_AND_COLLECTION_SCHEMA__OPERATIONS:
        return getOperations();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MyDslPackage.CRUD_OPERATION_AND_COLLECTION_SCHEMA__SCHEMA:
        setSchema((CollectionSchema)newValue);
        return;
      case MyDslPackage.CRUD_OPERATION_AND_COLLECTION_SCHEMA__OPERATIONS:
        getOperations().clear();
        getOperations().addAll((Collection<? extends CRUDOperations>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case MyDslPackage.CRUD_OPERATION_AND_COLLECTION_SCHEMA__SCHEMA:
        setSchema((CollectionSchema)null);
        return;
      case MyDslPackage.CRUD_OPERATION_AND_COLLECTION_SCHEMA__OPERATIONS:
        getOperations().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case MyDslPackage.CRUD_OPERATION_AND_COLLECTION_SCHEMA__SCHEMA:
        return schema != null;
      case MyDslPackage.CRUD_OPERATION_AND_COLLECTION_SCHEMA__OPERATIONS:
        return operations != null && !operations.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //CRUDOperationAndCollectionSchemaImpl
