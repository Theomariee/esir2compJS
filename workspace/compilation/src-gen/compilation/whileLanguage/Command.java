/**
 * generated by Xtext 2.15.0
 */
package compilation.whileLanguage;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Command</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link compilation.whileLanguage.Command#getCommand <em>Command</em>}</li>
 * </ul>
 *
 * @see compilation.whileLanguage.WhileLanguagePackage#getCommand()
 * @model
 * @generated
 */
public interface Command extends EObject
{
  /**
   * Returns the value of the '<em><b>Command</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Command</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Command</em>' containment reference.
   * @see #setCommand(EObject)
   * @see compilation.whileLanguage.WhileLanguagePackage#getCommand_Command()
   * @model containment="true"
   * @generated
   */
  EObject getCommand();

  /**
   * Sets the value of the '{@link compilation.whileLanguage.Command#getCommand <em>Command</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Command</em>' containment reference.
   * @see #getCommand()
   * @generated
   */
  void setCommand(EObject value);

} // Command