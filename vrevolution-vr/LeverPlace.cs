using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using Oculus.Interaction;
using Oculus.Interaction.Samples;
using System;

public class LeverPlace : MonoBehaviour
{
    LeverManager leverManager;

    public int weight = 0;
    public int index = 0;

    public enum State
    {
        Full,
        Empty
    }
    public State placeState = State.Empty;

    public enum WeightType
    {
        Ten = 10,
        Twenty = 20,
        Thirty = 30,
        Fourthy = 40,
        Fifty = 50
    }
    public WeightType weightType;

    void Start()
    {
        leverManager = LeverManager.Instance;
    }

    public void HandleInteractorChanged(string newInteractor)
    {
        WeightCheck(newInteractor);
        leverManager.CalculateBalance();
    }

    public void WeightCheck(string type)
    {
        if (placeState == State.Full)
        {
            placeState = State.Empty;
            leverManager.DestroyWeight(index);
            weight = 0;
        }
        else if (Enum.TryParse(type, out WeightType parsedWeightType))
        {
            weightType = parsedWeightType;
            weight = (int)weightType;
            placeState = State.Full;
            leverManager.UpdateWeightsPlaces(index, weight); 
        }
        else
        {
            Debug.LogError($"Unrecognized weight type: {type}");
        }
    }

}
