/**
 * generated by Xtext 2.32.0
 */
package org.xtext.example.mydsl1.myDsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl1.myDsl.ConnectionStatement;
import org.xtext.example.mydsl1.myDsl.MyDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connection Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl1.myDsl.impl.ConnectionStatementImpl#getConnectionString <em>Connection String</em>}</li>
 *   <li>{@link org.xtext.example.mydsl1.myDsl.impl.ConnectionStatementImpl#getDatabaseName <em>Database Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConnectionStatementImpl extends MinimalEObjectImpl.Container implements ConnectionStatement
{
  /**
   * The default value of the '{@link #getConnectionString() <em>Connection String</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConnectionString()
   * @generated
   * @ordered
   */
  protected static final String CONNECTION_STRING_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getConnectionString() <em>Connection String</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConnectionString()
   * @generated
   * @ordered
   */
  protected String connectionString = CONNECTION_STRING_EDEFAULT;

  /**
   * The default value of the '{@link #getDatabaseName() <em>Database Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDatabaseName()
   * @generated
   * @ordered
   */
  protected static final String DATABASE_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDatabaseName() <em>Database Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDatabaseName()
   * @generated
   * @ordered
   */
  protected String databaseName = DATABASE_NAME_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ConnectionStatementImpl()
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
    return MyDslPackage.Literals.CONNECTION_STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getConnectionString()
  {
    return connectionString;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setConnectionString(String newConnectionString)
  {
    String oldConnectionString = connectionString;
    connectionString = newConnectionString;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.CONNECTION_STATEMENT__CONNECTION_STRING, oldConnectionString, connectionString));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getDatabaseName()
  {
    return databaseName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setDatabaseName(String newDatabaseName)
  {
    String oldDatabaseName = databaseName;
    databaseName = newDatabaseName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.CONNECTION_STATEMENT__DATABASE_NAME, oldDatabaseName, databaseName));
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
      case MyDslPackage.CONNECTION_STATEMENT__CONNECTION_STRING:
        return getConnectionString();
      case MyDslPackage.CONNECTION_STATEMENT__DATABASE_NAME:
        return getDatabaseName();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MyDslPackage.CONNECTION_STATEMENT__CONNECTION_STRING:
        setConnectionString((String)newValue);
        return;
      case MyDslPackage.CONNECTION_STATEMENT__DATABASE_NAME:
        setDatabaseName((String)newValue);
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
      case MyDslPackage.CONNECTION_STATEMENT__CONNECTION_STRING:
        setConnectionString(CONNECTION_STRING_EDEFAULT);
        return;
      case MyDslPackage.CONNECTION_STATEMENT__DATABASE_NAME:
        setDatabaseName(DATABASE_NAME_EDEFAULT);
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
      case MyDslPackage.CONNECTION_STATEMENT__CONNECTION_STRING:
        return CONNECTION_STRING_EDEFAULT == null ? connectionString != null : !CONNECTION_STRING_EDEFAULT.equals(connectionString);
      case MyDslPackage.CONNECTION_STATEMENT__DATABASE_NAME:
        return DATABASE_NAME_EDEFAULT == null ? databaseName != null : !DATABASE_NAME_EDEFAULT.equals(databaseName);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (connectionString: ");
    result.append(connectionString);
    result.append(", databaseName: ");
    result.append(databaseName);
    result.append(')');
    return result.toString();
  }

} //ConnectionStatementImpl
