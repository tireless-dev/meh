// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.organization.systems

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val AttributeDefinition: ImageVector
  get() {
    val current = _attributeDefinition
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.AttributeDefinition",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M28 2 H4 a2 2 0 0 0 -2 2 v24 a2 2 0 0 0 2 2 h24 a2 2 0 0 0 2 -2 V4 a2 2 0 0 0 -2 -2 m0 26 H4 V4 h24z m-11.65 -6 -.96 -3.06 h-4.27 L10.18 22 h-2.3 l4.02 -12 h2.82 l3.99 12z m-3.06 -9.94 H13.2 L11.67 17 h3.17z m6.67 7.65 v-4.96 h-1.33 V13 h.7 c.65 0 .85 -.31 .85 -.93 v-1.5 h1.98 V13 H24 v1.75 h-1.84 v5.5 h1.7 V22 h-1.58 c-1.51 0 -2.32 -.83 -2.32 -2.29
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 28 2
          moveTo(x = 28.0f, y = 2.0f)
          // H 4
          horizontalLineTo(x = 4.0f)
          // a 2 2 0 0 0 -2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.0f,
            dy1 = 2.0f,
          )
          // v 24
          verticalLineToRelative(dy = 24.0f)
          // a 2 2 0 0 0 2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.0f,
            dy1 = 2.0f,
          )
          // h 24
          horizontalLineToRelative(dx = 24.0f)
          // a 2 2 0 0 0 2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.0f,
            dy1 = -2.0f,
          )
          // V 4
          verticalLineTo(y = 4.0f)
          // a 2 2 0 0 0 -2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.0f,
            dy1 = -2.0f,
          )
          // m 0 26
          moveToRelative(dx = 0.0f, dy = 26.0f)
          // H 4
          horizontalLineTo(x = 4.0f)
          // V 4
          verticalLineTo(y = 4.0f)
          // h 24z
          horizontalLineToRelative(dx = 24.0f)
          close()
          // m -11.65 -6
          moveToRelative(dx = -11.65f, dy = -6.0f)
          // l -0.96 -3.06
          lineToRelative(dx = -0.96f, dy = -3.06f)
          // h -4.27
          horizontalLineToRelative(dx = -4.27f)
          // L 10.18 22
          lineTo(x = 10.18f, y = 22.0f)
          // h -2.3
          horizontalLineToRelative(dx = -2.3f)
          // l 4.02 -12
          lineToRelative(dx = 4.02f, dy = -12.0f)
          // h 2.82
          horizontalLineToRelative(dx = 2.82f)
          // l 3.99 12z
          lineToRelative(dx = 3.99f, dy = 12.0f)
          close()
          // m -3.06 -9.94
          moveToRelative(dx = -3.06f, dy = -9.94f)
          // H 13.2
          horizontalLineTo(x = 13.2f)
          // L 11.67 17
          lineTo(x = 11.67f, y = 17.0f)
          // h 3.17z
          horizontalLineToRelative(dx = 3.17f)
          close()
          // m 6.67 7.65
          moveToRelative(dx = 6.67f, dy = 7.65f)
          // v -4.96
          verticalLineToRelative(dy = -4.96f)
          // h -1.33
          horizontalLineToRelative(dx = -1.33f)
          // V 13
          verticalLineTo(y = 13.0f)
          // h 0.7
          horizontalLineToRelative(dx = 0.7f)
          // c 0.65 0 0.85 -0.31 0.85 -0.93
          curveToRelative(
            dx1 = 0.65f,
            dy1 = 0.0f,
            dx2 = 0.85f,
            dy2 = -0.31f,
            dx3 = 0.85f,
            dy3 = -0.93f,
          )
          // v -1.5
          verticalLineToRelative(dy = -1.5f)
          // h 1.98
          horizontalLineToRelative(dx = 1.98f)
          // V 13
          verticalLineTo(y = 13.0f)
          // H 24
          horizontalLineTo(x = 24.0f)
          // v 1.75
          verticalLineToRelative(dy = 1.75f)
          // h -1.84
          horizontalLineToRelative(dx = -1.84f)
          // v 5.5
          verticalLineToRelative(dy = 5.5f)
          // h 1.7
          horizontalLineToRelative(dx = 1.7f)
          // V 22
          verticalLineTo(y = 22.0f)
          // h -1.58
          horizontalLineToRelative(dx = -1.58f)
          // c -1.51 0 -2.32 -0.83 -2.32 -2.29
          curveToRelative(
            dx1 = -1.51f,
            dy1 = 0.0f,
            dx2 = -2.32f,
            dy2 = -0.83f,
            dx3 = -2.32f,
            dy3 = -2.29f,
          )
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
      .also { _attributeDefinition = it }
  }

@Suppress("ObjectPropertyName")
private var _attributeDefinition: ImageVector? = null
