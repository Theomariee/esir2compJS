/**
 * generated by Xtext 2.15.0
 */
package compilation.whileLanguage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Read</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link compilation.whileLanguage.Read#getVariable <em>Variable</em>}</li>
 * </ul>
 *
 * @see compilation.whileLanguage.WhileLanguagePackage#getRead()
 * @model
 * @generated
 */
public interface Read extends EObject
{
  /**
   * Returns the value of the '<em><b>Variable</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variable</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variable</em>' attribute list.
   * @see compilation.whileLanguage.WhileLanguagePackage#getRead_Variable()
   * @model unique="false"
   * @generated
   */
  EList<String> getVariable();

} // Read
