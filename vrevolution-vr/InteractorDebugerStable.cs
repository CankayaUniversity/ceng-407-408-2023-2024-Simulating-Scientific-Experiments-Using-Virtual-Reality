using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using Oculus.Interaction;
using TMPro;

public class InteractorDebugerStable : MonoBehaviour
{
    private TMP_Text DebugText;
    [SerializeField, Interface(typeof(IInteractorView))]
    private UnityEngine.Object _interactorView;

    [SerializeField]
    private Renderer _renderer;

    [SerializeField]
    private Color _normalColor = Color.red;

    [SerializeField]
    private Color _hoverColor = Color.blue;

    [SerializeField]
    private Color _selectColor = Color.green;

    [SerializeField]
    private Color _disabledColor = Color.black;

    public Color NormalColor
    {
        get
        {
            return _normalColor;
        }
        set
        {
            _normalColor = value;
        }
    }

    public Color HoverColor
    {
        get
        {
            return _hoverColor;
        }
        set
        {
            _hoverColor = value;
        }
    }

    public Color SelectColor
    {
        get
        {
            return _selectColor;
        }
        set
        {
            _selectColor = value;
        }
    }

    public Color DisabledColor
    {
        get
        {
            return _disabledColor;
        }
        set
        {
            _disabledColor = value;
        }
    }


    private IInteractorView InteractorView;
    private Material _material;

    protected bool _started = false;

    protected virtual void Awake()
    {
        InteractorView = _interactorView as IInteractorView;
    }

    protected virtual void Start()
    {
        if (Debugger.Instance != null)
        {
            DebugText = Debugger.Instance.DebugText;
        }
        else
        {
            Debug.LogError("Debugger instance is missing!");
        }
        this.BeginStart(ref _started);
        this.AssertField(InteractorView, nameof(InteractorView));
        this.AssertField(_renderer, nameof(_renderer));

        _material = _renderer.material;
        this.EndStart(ref _started);
    }

    protected virtual void OnEnable()
    {
        if (_started)
        {
            InteractorView.WhenStateChanged += UpdateVisualState;
            UpdateVisual();
        }
    }

    protected virtual void OnDisable()
    {
        if (_started)
        {
            InteractorView.WhenStateChanged -= UpdateVisualState;
        }
    }

    private void UpdateVisual()
    {
        //DebugText.text = InteractorView.State.ToString();
        Debug.Log("BENNNA - " + InteractorView.State.ToString());
        switch (InteractorView.State)
        {
            case InteractorState.Select:
                _material.color = _selectColor;
                break;
            case InteractorState.Hover:
                _material.color = _hoverColor;
                break;
            case InteractorState.Normal:
                _material.color = _normalColor;
                break;
            case InteractorState.Disabled:
                _material.color = _disabledColor;
                break;
        }
    }

    private void UpdateVisualState(InteractorStateChangeArgs args) => UpdateVisual();

    private void OnDestroy()
    {
        Destroy(_material);
    }

    #region Inject

    public void InjectAllInteractorDebugVisual(IInteractorView interactorView, Renderer renderer)
    {
        InjectInteractorView(interactorView);
        InjectRenderer(renderer);
    }

    public void InjectInteractorView(IInteractorView interactorView)
    {
        _interactorView = interactorView as UnityEngine.Object;
        InteractorView = interactorView;
    }

    public void InjectRenderer(Renderer renderer)
    {
        _renderer = renderer;
    }

    #endregion
}
