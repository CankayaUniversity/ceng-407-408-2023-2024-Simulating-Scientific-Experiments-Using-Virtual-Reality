using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using Oculus.Interaction;
using Oculus.Interaction.Samples;

public class ElementPlace : MonoBehaviour
{
    Color _normalOrbitColor = new Color(1, 1, 1, 0.1f);
    Color _normalRingColor = new Color(1, 1, 1, 0.545f);
    Color _wrongColor = new Color(1, 0, 0, 1);
    Color _trueColor = new Color(0, 1, 0, 1);

    InteractableColorVisual[] interactableColorVisuals;
    ElectricityManager electricityManager;
    //public Ring ring;

    public enum State
    {
        True,
        False,
        Empty
    }
    public State placeState = State.Empty;

    public enum ElementType
    {
        Lamp, Battery, Switch
    }
    public ElementType planetType;

    void Start()
    {
        interactableColorVisuals = GetComponentsInChildren<InteractableColorVisual>();
        electricityManager = ElectricityManager.Instance;
        placeState = State.Empty;

        foreach (InteractableColorVisual visual in interactableColorVisuals)
        {
            visual.UpdateColor(_normalRingColor);
        }
    }

    public void HandleInteractorChanged(string newElement)
    {
        ElementCheck(newElement);
    }

    public void ElementCheck(string elementName)
    {
        Debug.Log("-" + elementName + "- -" + planetType.ToString() + "-");
        if (elementName == planetType.ToString())
        {
            Debug.Log("BENNA True" + elementName);
            ChangePlaceState(State.True);
            electricityManager.TrueAnswer();
        }
        else if (elementName == null || elementName == "")
        {
            Debug.Log("BENNA Empty" + elementName);
            ChangePlaceState(State.Empty);
        }
        else
        {
            Debug.Log("BENNA False" + elementName);
            ChangePlaceState(State.False);
            electricityManager.WrongAnswer();
        }
    }

    public void ChangePlaceState(State newState)
    {
        if (placeState != newState)
        {
            foreach (InteractableColorVisual visual in interactableColorVisuals)
            {
                Debug.Log(visual.gameObject.transform.parent.name + " interactable Color Visual and State: " + placeState + " " + newState);
                switch (newState)
                {
                    case State.True:
                        visual.UpdateColor(_trueColor);
                        break;

                    case State.False:
                        visual.UpdateColor(_wrongColor);
                        break;

                    case State.Empty:
                        visual.UpdateColor(_normalOrbitColor);
                        break;
                }
            }
            placeState = newState;
        }
    }
}

