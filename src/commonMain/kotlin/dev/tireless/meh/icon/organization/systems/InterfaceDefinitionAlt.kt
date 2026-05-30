// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.organization.systems

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val InterfaceDefinitionAlt: ImageVector
  get() {
    val current = _interfaceDefinitionAlt
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.InterfaceDefinitionAlt",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M28 30 H4 a2 2 0 0 1 -2 -2 V4 a2 2 0 0 1 2 -2 h24 a2 2 0 0 1 2 2 v24 a2 2 0 0 1 -2 2 M4 28 h24 V4 H4z m5 -6 v-1.82 h1.58 v-8.36 H9 V10 h5.45 v1.82 h-1.6 v8.36 h1.6 V22z m7.33 0 v-9 h2.2 v1.52 h.09 a2.5 2.5 0 0 1 2.5 -1.7 c1.85 0 2.88 1.27 2.88 3.5 V22 h-2.2 v-5.45 c0 -1.27 -.43 -1.93 -1.48 -1.93 -.91 0 -1.79 .48 -1.79 1.45 V22z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 28 30
          moveTo(x = 28.0f, y = 30.0f)
          // H 4
          horizontalLineTo(x = 4.0f)
          // a 2 2 0 0 1 -2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -2.0f,
            dy1 = -2.0f,
          )
          // V 4
          verticalLineTo(y = 4.0f)
          // a 2 2 0 0 1 2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 2.0f,
            dy1 = -2.0f,
          )
          // h 24
          horizontalLineToRelative(dx = 24.0f)
          // a 2 2 0 0 1 2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 2.0f,
            dy1 = 2.0f,
          )
          // v 24
          verticalLineToRelative(dy = 24.0f)
          // a 2 2 0 0 1 -2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -2.0f,
            dy1 = 2.0f,
          )
          // M 4 28
          moveTo(x = 4.0f, y = 28.0f)
          // h 24
          horizontalLineToRelative(dx = 24.0f)
          // V 4
          verticalLineTo(y = 4.0f)
          // H 4z
          horizontalLineTo(x = 4.0f)
          close()
          // m 5 -6
          moveToRelative(dx = 5.0f, dy = -6.0f)
          // v -1.82
          verticalLineToRelative(dy = -1.82f)
          // h 1.58
          horizontalLineToRelative(dx = 1.58f)
          // v -8.36
          verticalLineToRelative(dy = -8.36f)
          // H 9
          horizontalLineTo(x = 9.0f)
          // V 10
          verticalLineTo(y = 10.0f)
          // h 5.45
          horizontalLineToRelative(dx = 5.45f)
          // v 1.82
          verticalLineToRelative(dy = 1.82f)
          // h -1.6
          horizontalLineToRelative(dx = -1.6f)
          // v 8.36
          verticalLineToRelative(dy = 8.36f)
          // h 1.6
          horizontalLineToRelative(dx = 1.6f)
          // V 22z
          verticalLineTo(y = 22.0f)
          close()
          // m 7.33 0
          moveToRelative(dx = 7.33f, dy = 0.0f)
          // v -9
          verticalLineToRelative(dy = -9.0f)
          // h 2.2
          horizontalLineToRelative(dx = 2.2f)
          // v 1.52
          verticalLineToRelative(dy = 1.52f)
          // h 0.09
          horizontalLineToRelative(dx = 0.09f)
          // a 2.5 2.5 0 0 1 2.5 -1.7
          arcToRelative(
            a = 2.5f,
            b = 2.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 2.5f,
            dy1 = -1.7f,
          )
          // c 1.85 0 2.88 1.27 2.88 3.5
          curveToRelative(
            dx1 = 1.85f,
            dy1 = 0.0f,
            dx2 = 2.88f,
            dy2 = 1.27f,
            dx3 = 2.88f,
            dy3 = 3.5f,
          )
          // V 22
          verticalLineTo(y = 22.0f)
          // h -2.2
          horizontalLineToRelative(dx = -2.2f)
          // v -5.45
          verticalLineToRelative(dy = -5.45f)
          // c 0 -1.27 -0.43 -1.93 -1.48 -1.93
          curveToRelative(
            dx1 = 0.0f,
            dy1 = -1.27f,
            dx2 = -0.43f,
            dy2 = -1.93f,
            dx3 = -1.48f,
            dy3 = -1.93f,
          )
          // c -0.91 0 -1.79 0.48 -1.79 1.45
          curveToRelative(
            dx1 = -0.91f,
            dy1 = 0.0f,
            dx2 = -1.79f,
            dy2 = 0.48f,
            dx3 = -1.79f,
            dy3 = 1.45f,
          )
          // V 22z
          verticalLineTo(y = 22.0f)
          close()
        }
        // <rect width="32" height="32" fill="#000" style="fill:none" />
        path(
          fill = SolidColor(Color.Transparent),
        ) {
          // M 0 0
          moveTo(x = 0.0f, y = 0.0f)
          // h 32
          horizontalLineToRelative(dx = 32.0f)
          // v 32
          verticalLineToRelative(dy = 32.0f)
          // h -32z
          horizontalLineToRelative(dx = -32.0f)
          close()
        }
      }.build()
      .also { _interfaceDefinitionAlt = it }
  }

@Suppress("ObjectPropertyName")
private var _interfaceDefinitionAlt: ImageVector? = null
