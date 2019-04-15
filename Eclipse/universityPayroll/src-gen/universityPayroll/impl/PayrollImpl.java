/**
 */
package universityPayroll.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import universityPayroll.Payroll;
import universityPayroll.UniversityPayrollPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Payroll</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class PayrollImpl extends MinimalEObjectImpl.Container implements Payroll {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PayrollImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UniversityPayrollPackage.Literals.PAYROLL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void LoadFromDatabase() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void GeneratePaychecks() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case UniversityPayrollPackage.PAYROLL___LOAD_FROM_DATABASE:
			LoadFromDatabase();
			return null;
		case UniversityPayrollPackage.PAYROLL___GENERATE_PAYCHECKS:
			GeneratePaychecks();
			return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //PayrollImpl
