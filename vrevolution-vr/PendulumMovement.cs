using UnityEngine;

public class PendulumMovement : MonoBehaviour
{
    public Transform pivotPoint; // The point around which to rotate
    public Vector3 rotationAxis = Vector3.up; // The axis around which to rotate
    public float angleRange = 40f; // Maximum swing angle from the center
    public float period = 2f; // Period of one full swing (back and forth)

    private float timePassed = 0f; // Time tracker to calculate the current angle

    // Update is called once per frame
    void Update()
    {
        // Increment the time by the delta time
        timePassed += Time.deltaTime;

        // Calculate the current angle using the sine function
        float angle = angleRange * Mathf.Sin(Mathf.PI * 2 * timePassed / period);

        // Apply the rotation around the pivot point
        RotateAroundPoint(angle);
    }

    // Method to rotate the object around a point by a given angle
    public void RotateAroundPoint(float angle)
    {
        if (pivotPoint != null)
        {
            // Calculate the rotation as a Quaternion
            Quaternion rotation = Quaternion.AngleAxis(angle, rotationAxis);

            // Set the position of the object relative to the pivot point and rotate it
            transform.position = pivotPoint.position + rotation * (transform.position - pivotPoint.position);
            transform.rotation = rotation * Quaternion.Euler(0, -90, 0); // Adjusting based on your object's orientation
        }
        else
        {
            Debug.LogError("Pivot point is not assigned!");
        }
    }
}
