# Carbon Components Checklist

Done criteria for each component:
- **Spec**: Implementation matches the official [Carbon Design System](https://carbondesignsystem.com/building-blocks/core/components/overview) specification (guidelines, specifications, variants, states, sizing, and tokens).
- **Snapshots**: Roborazzi snapshot tests cover the component and pass (`./gradlew testAndroidHostTest`).

| Component | Spec | Snapshots | Done | Remark |
| :--- | :---: | :---: | :---: | :--- |
| [Accordion](https://carbondesignsystem.com/building-blocks/core/components/accordion) | [x] | [x] | [x] | |
| [AI label](https://carbondesignsystem.com/building-blocks/core/components/ai-label) | [ ] | [ ] | [ ] | |
| [Breadcrumb](https://carbondesignsystem.com/building-blocks/core/components/breadcrumb) | [x] | [x] | [x] | |
| [Button](https://carbondesignsystem.com/building-blocks/core/components/button) | [x] | [x] | [x] | |
| [Checkbox](https://carbondesignsystem.com/building-blocks/core/components/checkbox) | [x] | [x] | [x] | Includes `CheckboxGroup` |
| [Code snippet](https://carbondesignsystem.com/building-blocks/core/components/code-snippet) | [x] | [x] | [x] | |
| [Contained list](https://carbondesignsystem.com/building-blocks/core/components/contained-list) | [ ] | [ ] | [ ] | Currently in `List.kt` / `ListSnapshotTest.kt` |
| [Content switcher](https://carbondesignsystem.com/building-blocks/core/components/content-switcher) | [x] | [x] | [x] | |
| [Data table](https://carbondesignsystem.com/building-blocks/core/components/data-table) | [ ] | [ ] | [ ] | |
| [Date picker](https://carbondesignsystem.com/building-blocks/core/components/date-picker) | [ ] | [ ] | [ ] | Includes time picker |
| [Dropdown](https://carbondesignsystem.com/building-blocks/core/components/dropdown) | [ ] | [ ] | [ ] | Currently implemented as `Select`; includes combo box |
| [File uploader](https://carbondesignsystem.com/building-blocks/core/components/file-uploader) | [ ] | [ ] | [ ] | |
| [Form](https://carbondesignsystem.com/building-blocks/core/components/form) | [ ] | [ ] | [ ] | |
| [Icon button](https://carbondesignsystem.com/building-blocks/core/components/button/guidelines#icon-only-buttons) | [x] | [x] | [x] | Variant under Button spec |
| [Inline loading](https://carbondesignsystem.com/building-blocks/core/components/inline-loading) | [x] | [x] | [x] | Currently in `Loading.kt` / `LoadingSnapshotTest.kt` |
| [Link](https://carbondesignsystem.com/building-blocks/core/components/link) | [x] | [x] | [x] | |
| [List](https://carbondesignsystem.com/building-blocks/core/components/list) | [ ] | [ ] | [ ] | Includes ordered & unordered lists |
| [Loading](https://carbondesignsystem.com/building-blocks/core/components/loading) | [x] | [x] | [x] | |
| [Menu](https://carbondesignsystem.com/building-blocks/core/components/menu) | [x] | [x] | [x] | |
| [Menu buttons](https://carbondesignsystem.com/building-blocks/core/components/menu-buttons) | [x] | [x] | [x] | Includes menu button, combo button, overflow menu |
| [Modal](https://carbondesignsystem.com/building-blocks/core/components/modal) | [ ] | [ ] | [ ] | |
| [Multiselect](https://carbondesignsystem.com/building-blocks/core/components/dropdown/guidelines#multiselect) | [ ] | [ ] | [ ] | Variant under Dropdown spec |
| [Notification](https://carbondesignsystem.com/building-blocks/core/components/notification) | [ ] | [ ] | [ ] | Includes toast, inline, actionable, callout |
| [Number input](https://carbondesignsystem.com/building-blocks/core/components/number-input) | [x] | [x] | [x] | |
| [Pagination](https://carbondesignsystem.com/building-blocks/core/components/pagination) | [ ] | [ ] | [ ] | Includes pagination nav |
| [Popover](https://carbondesignsystem.com/building-blocks/core/components/popover) | [x] | [x] | [x] | |
| [Progress bar](https://carbondesignsystem.com/building-blocks/core/components/progress-bar) | [x] | [x] | [x] | |
| [Progress indicator](https://carbondesignsystem.com/building-blocks/core/components/progress-indicator) | [x] | [x] | [x] | |
| [Radio button](https://carbondesignsystem.com/building-blocks/core/components/radio-button) | [x] | [x] | [x] | Includes `RadioButtonGroup` |
| [Search](https://carbondesignsystem.com/building-blocks/core/components/search) | [x] | [x] | [x] | |
| [Select](https://carbondesignsystem.com/building-blocks/core/components/select) | [ ] | [ ] | [ ] | |
| [Slider](https://carbondesignsystem.com/building-blocks/core/components/slider) | [ ] | [ ] | [ ] | |
| [Structured list](https://carbondesignsystem.com/building-blocks/core/components/structured-list) | [ ] | [ ] | [ ] | |
| [Tabs](https://carbondesignsystem.com/building-blocks/core/components/tabs) | [x] | [x] | [x] | |
| [Tag](https://carbondesignsystem.com/building-blocks/core/components/tag) | [x] | [x] | [x] | Includes read-only, dismissible, selectable, operational |
| [Text input](https://carbondesignsystem.com/building-blocks/core/components/text-input) | [x] | [x] | [x] | Includes text area & password input |
| [Tile](https://carbondesignsystem.com/building-blocks/core/components/tile) | [ ] | [ ] | [ ] | Includes base, clickable, selectable, expandable |
| [Toggle](https://carbondesignsystem.com/building-blocks/core/components/toggle) | [x] | [x] | [x] | |
| [Toggletip](https://carbondesignsystem.com/building-blocks/core/components/toggletip) | [x] | [x] | [x] | |
| [Tooltip](https://carbondesignsystem.com/building-blocks/core/components/tooltip) | [x] | [x] | [x] | Includes definition tooltip |
| [Tree view](https://carbondesignsystem.com/building-blocks/core/components/tree-view) | [ ] | [ ] | [ ] | |
| [UI shell header](https://carbondesignsystem.com/building-blocks/core/components/ui-shell-header) | [ ] | [ ] | [ ] | Header implemented |
| [UI shell left panel](https://carbondesignsystem.com/building-blocks/core/components/ui-shell-left-panel) | [ ] | [ ] | [ ] | Not implemented yet |
| [UI shell right panel](https://carbondesignsystem.com/building-blocks/core/components/ui-shell-right-panel) | [ ] | [ ] | [ ] | Not implemented yet |
