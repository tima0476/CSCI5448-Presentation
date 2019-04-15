/**
 */
package universityPayroll.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import universityPayroll.Payroll;
import universityPayroll.UniversityPayrollFactory;
import universityPayroll.UniversityPayrollPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UniversityPayrollPackageImpl extends EPackageImpl implements UniversityPayrollPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass payrollEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see universityPayroll.UniversityPayrollPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private UniversityPayrollPackageImpl() {
		super(eNS_URI, UniversityPayrollFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link UniversityPayrollPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static UniversityPayrollPackage init() {
		if (isInited)
			return (UniversityPayrollPackage) EPackage.Registry.INSTANCE.getEPackage(UniversityPayrollPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredUniversityPayrollPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		UniversityPayrollPackageImpl theUniversityPayrollPackage = registeredUniversityPayrollPackage instanceof UniversityPayrollPackageImpl
				? (UniversityPayrollPackageImpl) registeredUniversityPayrollPackage
				: new UniversityPayrollPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theUniversityPayrollPackage.createPackageContents();

		// Initialize created meta-data
		theUniversityPayrollPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theUniversityPayrollPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(UniversityPayrollPackage.eNS_URI, theUniversityPayrollPackage);
		return theUniversityPayrollPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPayroll() {
		return payrollEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPayroll__LoadFromDatabase() {
		return payrollEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPayroll__GeneratePaychecks() {
		return payrollEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UniversityPayrollFactory getUniversityPayrollFactory() {
		return (UniversityPayrollFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		payrollEClass = createEClass(PAYROLL);
		createEOperation(payrollEClass, PAYROLL___LOAD_FROM_DATABASE);
		createEOperation(payrollEClass, PAYROLL___GENERATE_PAYCHECKS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(payrollEClass, Payroll.class, "Payroll", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getPayroll__LoadFromDatabase(), null, "LoadFromDatabase", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getPayroll__GeneratePaychecks(), null, "GeneratePaychecks", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //UniversityPayrollPackageImpl
