# Tone (`Productive` vs `Expressive`)

Carbon Design System defines two experience modes—**Productive** (dense application UIs focused on task efficiency, the default) and **Expressive** (editorial, marketing, and prominent hero moments).

In **meh**, this is modeled globally via [`Tone`](../src/commonMain/kotlin/dev/tireless/meh/theme/MehTheme.kt) (`Tone.Productive`, `Tone.Expressive`) provided through `MehTheme(tone = ...)` / `MehTheme.tone` (`LocalTone`), with component-level overrides where supported.

## Core Components Affected by `Tone.Expressive`

Out of the Carbon v11 core component set, only **2** component families have an expressive mode:

| Component | Affected Variants | `Productive` → `Expressive` Changes |
| :--- | :--- | :--- |
| **Button** | All 7 button kinds (`Primary`, `Secondary`, `Tertiary`, `Ghost`, `Danger.Primary`, `Danger.Tertiary`, `Danger.Ghost`) **only at `ControlSize.Large` (`48dp`)** (`XSmall`/`Small`/`Medium` and full-bleed `XLarge`/`XXLarge` remain productive); **ButtonSet** | Label: `Typography.bodyCompact01` (`14sp / 18sp`) → `Typography.bodyCompact02` (`16sp / 22sp`)<br>Icon: `IconSize.Small` (`16dp`) → `IconSize.Expressive` (`20dp`)<br>ButtonSet item max width: `196dp` → `320dp` |
| **List** | `OrderedList` and `UnorderedList` (including nested sublists). *Does not apply to `ContainedList` or `StructuredList`.* | Item text: `Typography.body01` (`14sp / 20sp`) → `Typography.body02` (`16sp / 24sp`) |

Notes:
- `IconButton`, Copy button, and Chat button do not have expressive variants.
- On `Button`, the component-level override is `expressive: Boolean = MehTheme.tone == Tone.Expressive`, and only takes effect when `size == ControlSize.Large` (or `ControlSize.Unspecified`, which resolves to `Large`).

## Foundations Affected by `Tone`

- **Typography** (`Typography.kt`):
  - Productive (`-01`, `14sp` base): `body01`, `bodyCompact01`, `heading01`, `headingCompact01`, `code01`, `label01`, `helperText01`.
  - Expressive (`-02`, `16sp` base + fluid headings): `body02`, `bodyCompact02`, `heading02`, `headingCompact02`, `code02`, `label02`, `helperText02`, plus fluid heading/display/quotation scales.
- **Motion**:
  - Productive easing curves for subtle microinteractions (control states, dropdowns, disclosures).
  - Expressive easing curves for prominent transitions (page entrances, primary actions, notifications/alerts).
- **Pictograms**:
  - Productive (simple, flat) vs Expressive (layered, gradient) artwork (asset-level choice rather than a component modifier).

## Components *Not* Affected by `Tone` in Core Carbon

- **Fluid form inputs** (`Form`, `TextInput`, `Select`, `Dropdown`, `DatePicker`, `NumberInput`, `Search`): Carbon guidelines recommend their **Fluid** variant (`64dp` flush/internal-label layout) in expressive moments, but Fluid is a separate structural variant rather than a `Tone` toggle.
- **Modal & Tile**: Core Carbon `Modal` and `Tile` have no expressive mode (`ExpressiveModal` is in Carbon for IBM.com; `ExpressiveCard` is in Carbon for IBM Products).
- **All other core components** (`Accordion`, `AI label`, `Breadcrumb`, `Checkbox`, `Code snippet`, `Contained list`, `Content switcher`, `Data table`, `File uploader`, `Inline loading`, `Link`, `Loading`, `Menu`, `Menu buttons`, `Multiselect`, `Notification`, `Pagination`, `Popover`, `Progress bar`, `Progress indicator`, `Radio button`, `Slider`, `Structured list`, `Tabs`, `Tag`, `Toggle`, `Toggletip`, `Tooltip`, `Tree view`, `UI shell`): no expressive variant in core Carbon.

## References

- [Carbon Button Guidelines — Sizes](https://www.carbondesignsystem.com/building-blocks/core/components/button/guidelines#button-sizes)
- [Carbon Button Specifications](https://www.carbondesignsystem.com/building-blocks/core/components/button/specifications)
- [Carbon List Specifications](https://www.carbondesignsystem.com/building-blocks/core/components/list/specifications)
- [Carbon Typography](https://www.carbondesignsystem.com/building-blocks/foundations/typography/overview)
- [Carbon Motion](https://www.carbondesignsystem.com/building-blocks/foundations/motion/overview)
