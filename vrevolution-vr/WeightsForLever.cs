using UnityEngine;

public class WeightsForLever : MonoBehaviour
{
    public enum WeightType { None, WType0, WType1, WType2, WType3 }

    public WeightType weightType = WeightType.None;
    public SimultaneousPlacement simultaneousPlacement;
    public int index;
    public GameObject weightOnPoint = null;

    public GameObject weightunit = null;

    private void Start()
    {
        simultaneousPlacement = FindObjectOfType<SimultaneousPlacement>();
    }

    private void OnTriggerEnter(Collider other)
    {
        if (other.CompareTag("Weight") && weightOnPoint == null)
        {
            Weight weight = other.GetComponent<Weight>();
            if (weight != null)
            {
                weightType = (WeightType)(weight.type + 1); // Adjusting for zero-based indexing
                weightunit = other.gameObject;
                UpdateWeights();
            }
        }
    }

    private void OnTriggerExit(Collider other)
    {
        if (other.gameObject.CompareTag("Weight") && weightOnPoint != null && other.gameObject.GetComponent<Weight>().type == (int)weightType-1)
        {
            weightType = WeightType.None;
            DestroyWeight();
        }
    }

    private void UpdateWeights()
    {
        if (weightOnPoint == null)
        {
            simultaneousPlacement.UpdateWeights(index, (int)weightType - 2);
        }
        else
        {
            Debug.Log("Slot at index " + index + " is already occupied");
        }
    }

    private void DestroyWeight()
    {
        if (weightOnPoint != null)
        {
            simultaneousPlacement.DestroyWeights(weightOnPoint, index);
            weightunit = null;
            Debug.Log("Weight removed from point: " + index);
        }
    }
}
