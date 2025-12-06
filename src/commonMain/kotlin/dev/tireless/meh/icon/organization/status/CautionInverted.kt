package dev.tireless.meh.icon.organization.status

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val CautionInverted: ImageVector
  get() {
    val current = _cautionInverted
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.CautionInverted",
        defaultWidth = 16.0.dp,
        defaultHeight = 16.0.dp,
        viewportWidth = 16.0f,
        viewportHeight = 16.0f,
      ).apply {
        // <polygon points="8.0 14.0 2.0 3.0 14.0 3.0 8.0 14.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 8 14
          moveTo(x = 8.0f, y = 14.0f)
          // L 2 3
          lineTo(x = 2.0f, y = 3.0f)
          // L 14 3
          lineTo(x = 14.0f, y = 3.0f)
          // L 8 14z
          lineTo(x = 8.0f, y = 14.0f)
          close()
        }
        // <rect width="16" height="16" fill="#000" style="fill:none" />
        path(
          fill = SolidColor(Color.Transparent),
        ) {
          // M 0 0
          moveTo(x = 0.0f, y = 0.0f)
          // h 16
          horizontalLineToRelative(dx = 16.0f)
          // v 16
          verticalLineToRelative(dy = 16.0f)
          // h -16z
          horizontalLineToRelative(dx = -16.0f)
          close()
        }
      }.build()
      .also { _cautionInverted = it }
  }

@Suppress("ObjectPropertyName")
private var _cautionInverted: ImageVector? = null
